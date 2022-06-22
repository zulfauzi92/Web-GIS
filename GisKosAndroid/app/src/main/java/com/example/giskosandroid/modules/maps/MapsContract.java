package com.example.giskosandroid.modules.maps;

import com.example.giskosandroid.base.BasePresenter;
import com.example.giskosandroid.base.BaseView;
import com.example.giskosandroid.callbacks.RequestCallback;
import com.example.giskosandroid.data.models.Kos;
import com.example.giskosandroid.responses.KosListResponse;

import java.util.List;

public interface MapsContract {
    interface Presenter extends BasePresenter {
        void loadKosList();
    }

    interface View extends BaseView<Presenter> {
        void startLoading();
        void endLoading();
        void showMessage(String message);
        void showKosList(List<Kos> kosList);
    }

    interface Interactor {
        void requestKosList(RequestCallback<KosListResponse> callback);
    }
}
