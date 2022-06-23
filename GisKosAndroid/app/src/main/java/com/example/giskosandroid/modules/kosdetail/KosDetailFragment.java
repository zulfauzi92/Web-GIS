package com.example.giskosandroid.modules.kosdetail;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.example.giskosandroid.R;
import com.example.giskosandroid.base.BaseFragment;
import com.example.giskosandroid.data.models.Kos;
import com.example.giskosandroid.data.models.KosCategoryPrice;
import com.example.giskosandroid.data.models.KosFacility;
import com.example.giskosandroid.modules.maps.MapsActivity;
import com.example.giskosandroid.utils.KosDetailGalleryAdapter;

import java.text.NumberFormat;
import java.util.Locale;

public class KosDetailFragment extends BaseFragment<KosDetailActivity, KosDetailContract.Presenter>
        implements KosDetailContract.View {
    private ProgressBar pbLoading;
    private int kosId;
    private ViewPager vpGallery;
    private TextView tvKosDetail;

    public KosDetailFragment() { }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        super.onCreateView(inflater, container, savedInstanceState);

        fragmentView = inflater.inflate(R.layout.fragment_kosdetail, container, false);
//        vpGallery = fragmentView.findViewById(R.id.kosdetail_vp_gallery);
        tvKosDetail = fragmentView.findViewById(R.id.kosdetail_tv_detail);
        pbLoading = fragmentView.findViewById(R.id.kosdetail_pb_loading);

        pbLoading.setVisibility(View.GONE);

        mPresenter = new KosDetailPresenter(this, new KosDetailInteractor());
        mPresenter.start();

        mPresenter.loadKosDetail(kosId);

        return fragmentView;
    }

    @Override
    public void setPresenter(KosDetailContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public KosDetailContract.Presenter getPresenter() {
        return mPresenter;
    }

    @Override
    public void setCurrentKosId(int id) {
        this.kosId = id;
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
    public void showKosDetail(@NonNull Kos kos) {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id_ID"));
        String bullet = "•";

//        vpGallery.setAdapter(new KosDetailGalleryAdapter(getActivity(), kos.getGallery()));

        tvKosDetail.append("Nama : \n" + bullet + "\t" + kos.getName() + "\n\n");
        tvKosDetail.append("Alamat : \n" + bullet + "\t" + kos.getAddress() + "\n\n");
        tvKosDetail.append("Keterangan : \n" + bullet + "\t" + kos.getDescription() + "\n\n");
        tvKosDetail.append("Tipe Kos : \n" + bullet + "\t" + kos.getKos_type() + "\n\n");
        tvKosDetail.append("Pemilik : \n" + bullet + "\t" + kos.getOwner_name() + "\n\n");
        tvKosDetail.append("Jarak (ke PENS) : \n" + bullet + "\t" + kos.getDistance() + " km\n\n");
        tvKosDetail.append("Latitude : \n" + bullet + "\t" + kos.getLatitude() + "\n\n");
        tvKosDetail.append("Longitude : \n" + bullet + "\t" + kos.getLongitude() + "\n\n");
        tvKosDetail.append("Fasilitas : \n");
        for (KosFacility facility : kos.getFacility()) {
            tvKosDetail.append(bullet + "\t" + facility.getName() + "\n");
        }
        tvKosDetail.append("\nKategori Harga : \n");
        for (KosCategoryPrice price : kos.getCategory_price()) {
            tvKosDetail.append(
                    bullet
                            + "\tRp"
                            + formatter.format(Double.parseDouble(price.getPrice()))
                            + ",00 "
                            + price.getName()
                            + "\n"
            );
        }
    }

    @Override
    public void redirectToMaps() {
        Intent intent = new Intent(activity, MapsActivity.class);

        startActivity(intent);
        activity.finish();
    }
}
