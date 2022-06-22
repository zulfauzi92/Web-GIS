package com.example.giskosandroid.modules.kosdetail;

import com.example.giskosandroid.callbacks.RequestCallback;
import com.example.giskosandroid.responses.KosDetailResponse;

public class KosDetailPresenter implements KosDetailContract.Presenter {
    private final KosDetailContract.View view;
    private final KosDetailContract.Interactor interactor;

    public KosDetailPresenter(
            KosDetailContract.View view,
            KosDetailContract.Interactor interactor
    ) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void start() { }

    @Override
    public void loadKosDetail(int id) {
        view.startLoading();
        interactor.requestKosDetail(id, new RequestCallback<KosDetailResponse>() {
            @Override
            public void onSuccess(KosDetailResponse response) {
                view.endLoading();
                view.showKosDetail(response.detail_kos);
            }

            @Override
            public void onFailure(String errorMessage) {
                view.endLoading();
                view.showMessage(errorMessage);
            }
        });
    }
}
