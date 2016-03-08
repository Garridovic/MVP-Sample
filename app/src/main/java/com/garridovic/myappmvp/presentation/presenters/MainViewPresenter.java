package com.garridovic.myappmvp.presentation.presenters;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.garridovic.myappmvp.presentation.MainView;

/**
 * Created by iliberi on 8/3/16.
 * Este presentador pide la informacion, la formatea y le dice a la vista que hacer con ella
 */
public interface MainViewPresenter extends MvpPresenter<MainView> {
        public void loadSomething();
}
