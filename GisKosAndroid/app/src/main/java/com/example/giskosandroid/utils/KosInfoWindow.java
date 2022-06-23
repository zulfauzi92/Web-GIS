package com.example.giskosandroid.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.giskosandroid.R;
import com.example.giskosandroid.data.models.Kos;
import com.example.giskosandroid.modules.kosdetail.KosDetailActivity;

import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.infowindow.InfoWindow;

public class KosInfoWindow extends InfoWindow {
    Activity activity;

    public KosInfoWindow(Activity activity, MapView mapView) {
        super(R.layout.layout_kosinfowindow, mapView);
        this.activity = activity;
    }

    public KosInfoWindow(View v, MapView mapView) {
        super(v, mapView);
    }

    @Override
    public void onOpen(Object item) {
        Marker marker = (Marker) item;
        Kos kos = (Kos) marker.getRelatedObject();

        TextView tvNamaLokasi = mView.findViewById(R.id.maps_iw_tv_name);
        TextView tvAlamat = mView.findViewById(R.id.maps_iw_tv_address);

        tvNamaLokasi.setText(kos.getName());
        tvAlamat.setText(kos.getAddress());

        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, KosDetailActivity.class);

                intent.putExtra(Constants.EXTRA_KOS_ID, kos.getId());
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public void onClose() { }
}
