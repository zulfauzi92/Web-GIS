package com.example.giskosandroid.utils;

import android.view.View;
import android.widget.TextView;

import com.example.giskosandroid.R;
import com.example.giskosandroid.data.models.Kos;

import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.infowindow.InfoWindow;

public class KosInfoWindow extends InfoWindow {
//    MapView mView;

    public KosInfoWindow(MapView mapView) {
        super(R.layout.layout_kosinfowindow, mapView);
    }

    public KosInfoWindow(View v, MapView mapView) {
        super(v, mapView);
    }

    @Override
    public void onOpen(Object item) {
        Marker marker = (Marker) item;
        Kos infoWindowData = (Kos) marker.getRelatedObject();

        TextView tvNamaLokasi = mView.findViewById(R.id.maps_iw_tv_name);
        TextView tvAlamat = mView.findViewById(R.id.maps_iw_tv_address);

        tvNamaLokasi.setText(infoWindowData.getName());
        tvAlamat.setText(infoWindowData.getAddress());

        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                goToKosDetail();
            }
        });
    }

    @Override
    public void onClose() {

    }
}
