package com.garridovic.myappmvp.presenters;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.garridovic.myappmvp.MainView;

/**
 * Created by iliberi on 8/3/16.
 * Este presentador pide la informacion, la formatea y le dice a la vista que hacer con ella
 */
public interface MainViewPresenter extends MvpPresenter<MainView> {
        void loadSomething();
}
