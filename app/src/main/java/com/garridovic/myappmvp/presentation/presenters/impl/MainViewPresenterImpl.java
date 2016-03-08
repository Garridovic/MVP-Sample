package com.garridovic.myappmvp.presentation.presenters.impl;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.garridovic.myappmvp.presentation.MainView;
import com.garridovic.myappmvp.presentation.presenters.MainViewPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iliberi on 8/3/16.
 */
public class MainViewPresenterImpl extends MvpBasePresenter<MainView> implements MainViewPresenter{
    @Override
    public void loadSomething() {
        List<String> resultado = new ArrayList<>();
        resultado.add("Hola MVP");
        resultado.add("Esta es una sencilla implementacion del patrón MVP sin las clases LCE");
        resultado.add("Espero poder seguir investigando nuevas facetas de este patrón");

        MainView mainView = getView();
        mainView.showSomething(resultado);
    }
}
