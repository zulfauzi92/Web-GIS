package com.example.giskosandroid.modules.kosdetail;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.giskosandroid.callbacks.RequestCallback;
import com.example.giskosandroid.responses.KosDetailResponse;
import com.example.giskosandroid.utils.Constants;

public class KosDetailInteractor  implements KosDetailContract.Interactor {
    public KosDetailInteractor() { }

    @Override
    public void requestKosDetail(int id, RequestCallback<KosDetailResponse> callback) {
        AndroidNetworking.get(Constants.BASE_URL + Constants.KOS_ENDPOINT + "/{id}")
                .addPathParameter("id", Integer.toString(id))
                .build()
                .getAsObject(
                        KosDetailResponse.class,
                        new ParsedRequestListener<KosDetailResponse>() {
                            @Override
                            public void onResponse(KosDetailResponse response) {
                                if (response == null) {
                                    callback.onFailure("Null response.");
                                } else if (response.detail_kos != null) {
                                    callback.onSuccess(response);
                                } else {
                                    callback.onFailure("No Data.");
                                }
                            }

                            @Override
                            public void onError(ANError anError) {
                                if (anError.getErrorCode() == 404) {
                                    callback.onFailure("Kos not found.");
                                } else {
                                    callback.onFailure("Failed to fetch kos detail.");
                                }
                            }
                        }
                );
    }
}
