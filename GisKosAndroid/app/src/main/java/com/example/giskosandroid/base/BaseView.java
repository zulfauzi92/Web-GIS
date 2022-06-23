package com.example.giskosandroid.base;


public interface BaseView<T> {
    void setPresenter(T presenter);
    T getPresenter();
}
