package com.garridovic.myappmvp.presentation;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;

import java.util.List;

/**
 * Created by iliberi on 8/3/16.
 */
public interface MainView extends MvpView {
    public void showSomething(List<String> something);
}
