package com.example.giskosandroid.modules.maps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import com.example.giskosandroid.R;
import com.example.giskosandroid.base.BaseFragment;
import com.example.giskosandroid.data.models.Kos;
import com.example.giskosandroid.utils.Constants;
import com.example.giskosandroid.utils.KosInfoWindow;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.CustomZoomButtonsController;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.infowindow.InfoWindow;

import java.util.List;

public class MapsFragment extends BaseFragment<MapsActivity, MapsContract.Presenter>
        implements MapsContract.View {
    private MapView mvMap = null;
    private ProgressBar pbLoading;
    private MapController mapController;

    public MapsFragment() { }

    public MapView getMvMap() {
        return mvMap;
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);

        fragmentView = inflater.inflate(R.layout.fragment_maps, container, false);
        mvMap = fragmentView.findViewById(R.id.maps_mv_map);
        pbLoading = fragmentView.findViewById(R.id.maps_pb_loading);

        pbLoading.setVisibility(View.GONE);

        mPresenter = new MapsPresenter(this, new MapsInteractor());
        mPresenter.start();

        mvMap.setTileSource(TileSourceFactory.MAPNIK);
        GeoPoint geoPoint = new GeoPoint(Constants.PENS_LAT, Constants.PENS_LONG);
        mvMap.setMultiTouchControls(true);
        mvMap.getController().animateTo(geoPoint);
        mvMap.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
        mvMap.getZoomController().setVisibility(CustomZoomButtonsController.Visibility.NEVER);

        mapController = (MapController) mvMap.getController();
        mapController.setCenter(geoPoint);
        mapController.zoomTo(15);

        mPresenter.loadKosList();

        return fragmentView;
    }

    @Override
    public void setPresenter(MapsContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public MapsContract.Presenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void startLoading() {
        pbLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void endLoading() {
        pbLoading.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showKosList(@NonNull List<Kos> kosList) {
        for (int i = -1; i < kosList.size(); i++) {
            if (i == -1) {
                GeoPoint pensGeoPoint = new GeoPoint(Constants.PENS_LAT, Constants.PENS_LONG);
                Marker marker = new Marker(mvMap);

                marker.setPosition(pensGeoPoint);
                marker.setIcon(
                        ResourcesCompat.getDrawable(getResources(), R.mipmap.ic_pens, null)
                );
                marker.setInfoWindow(null);
                marker.setOnMarkerClickListener(new Marker.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker, MapView mapView) {
                        InfoWindow.closeAllInfoWindowsOn(mapView);
                        mapController.zoomTo(15);
                        mapController.animateTo(marker.getPosition());
                        return true;
                    }
                });

                mvMap.getOverlays().add(marker);
                mvMap.invalidate();
            } else {
                Kos kos = kosList.get(i);
                GeoPoint kosGeoPoint = new GeoPoint(kos.getLatitude(), kos.getLongitude());
                Marker marker = new Marker(mvMap);

                marker.setPosition(kosGeoPoint);
                marker.setRelatedObject(kos);
                marker.setInfoWindow(new KosInfoWindow(getActivity(), mvMap));
                marker.setOnMarkerClickListener(new Marker.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker, MapView mapView) {
                        InfoWindow.closeAllInfoWindowsOn(mapView);
                        mapController.zoomTo(15);
                        mapController.animateTo(marker.getPosition());
                        marker.showInfoWindow();
                        return true;
                    }
                });

                mvMap.getOverlays().add(marker);
                mvMap.invalidate();
            }
        }
    }
}
