package com.example.giskosandroid.modules.kosdetail;

import com.example.giskosandroid.base.BasePresenter;
import com.example.giskosandroid.base.BaseView;
import com.example.giskosandroid.callbacks.RequestCallback;
import com.example.giskosandroid.data.models.Kos;
import com.example.giskosandroid.responses.KosDetailResponse;
import com.example.giskosandroid.responses.KosListResponse;

public interface KosDetailContract {
    interface Presenter extends BasePresenter {
        void loadKosDetail(int id);
    }

    interface View extends BaseView<Presenter> {
        void startLoading();
        void endLoading();
        void showMessage(String message);
        void showKosDetail(Kos kosDetail);
    }

    interface Interactor {
        void requestKosDetail(int id, RequestCallback<KosDetailResponse> callback);
    }
}
