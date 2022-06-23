package com.example.giskosandroid.modules.maps;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.giskosandroid.callbacks.RequestCallback;
import com.example.giskosandroid.responses.KosListResponse;
import com.example.giskosandroid.utils.Constants;

public class MapsInteractor implements MapsContract.Interactor {
    public MapsInteractor() { }

    @Override
    public void requestKosList(RequestCallback<KosListResponse> callback) {
        AndroidNetworking.get(Constants.BASE_URL + Constants.KOS_ENDPOINT)
                .build()
                .getAsObject(KosListResponse.class, new ParsedRequestListener<KosListResponse>() {
                    @Override
                    public void onResponse(KosListResponse response) {
                        if (response == null) {
                            callback.onFailure("Null response.");
                        } else if (response.data != null) {
                            callback.onSuccess(response);
                        } else {
                            callback.onFailure("No data.");
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        callback.onFailure(anError.getMessage());
                    }
                });
    }
}
