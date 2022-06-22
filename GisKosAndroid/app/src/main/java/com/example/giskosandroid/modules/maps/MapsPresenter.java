package com.example.giskosandroid.modules.maps;

import com.example.giskosandroid.callbacks.RequestCallback;
import com.example.giskosandroid.responses.KosListResponse;

public class MapsPresenter implements MapsContract.Presenter {
    private final MapsContract.View view;
    private final MapsContract.Interactor interactor;

    public MapsPresenter(MapsContract.View view, MapsContract.Interactor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void start() { }

    @Override
    public void loadKosList() {
        view.startLoading();
        interactor.requestKosList(new RequestCallback<KosListResponse>() {
            @Override
            public void onSuccess(KosListResponse response) {
                view.endLoading();
                view.showKosList(response.data);
            }

            @Override
            public void onFailure(String errorMessage) {
                view.endLoading();
                view.showMessage(errorMessage);
            }
        });
    }
}
