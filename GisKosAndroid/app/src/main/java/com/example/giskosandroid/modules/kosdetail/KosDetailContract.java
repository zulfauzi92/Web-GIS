package com.example.giskosandroid.modules.kosdetail;

import com.example.giskosandroid.base.BasePresenter;
import com.example.giskosandroid.base.BaseView;
import com.example.giskosandroid.callbacks.RequestCallback;
import com.example.giskosandroid.data.models.Kos;
import com.example.giskosandroid.responses.KosDetailResponse;

public interface KosDetailContract {
    interface Presenter extends BasePresenter {
        void loadKosDetail(int id);
    }

    interface View extends BaseView<Presenter> {
        void setCurrentKosId(int id);
        void startLoading();
        void endLoading();
        void showMessage(String message);
        void showKosDetail(Kos kosDetail);
        void redirectToMaps();
    }

    interface Interactor {
        void requestKosDetail(int id, RequestCallback<KosDetailResponse> callback);
    }
}
