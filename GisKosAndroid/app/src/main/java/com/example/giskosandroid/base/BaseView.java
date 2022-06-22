package com.example.giskosandroid.base;


public interface BaseView<T> {
    void setPresenter(T presenter);
    T getPresenter();

//    void setLoadingDialog(boolean isLoading, @Nullable String message);
//    void showStatus(int type, String message);
}
