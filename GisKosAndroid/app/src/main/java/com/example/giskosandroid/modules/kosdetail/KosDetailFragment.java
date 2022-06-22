package com.example.giskosandroid.modules.kosdetail;

import android.widget.ProgressBar;

import com.example.giskosandroid.base.BaseFragment;
import com.example.giskosandroid.data.models.Kos;

import org.osmdroid.views.MapView;

public class KosDetailFragment extends BaseFragment<KosDetailActivity, KosDetailContract.Presenter>
        implements KosDetailContract.View {
    private MapView mvMap = null;
    private ProgressBar pbLoading;

    @Override
    public void setPresenter(KosDetailContract.Presenter presenter) {

    }

    @Override
    public KosDetailContract.Presenter getPresenter() {
        return null;
    }

    @Override
    public void startLoading() {

    }

    @Override
    public void endLoading() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showKosDetail(Kos kosDetail) {

    }
}
