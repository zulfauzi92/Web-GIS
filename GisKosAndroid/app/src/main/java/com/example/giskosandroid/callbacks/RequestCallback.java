package com.example.giskosandroid.callbacks;

public interface RequestCallback<T> {
    void onSuccess(T response);
    void onFailure(String message);
}