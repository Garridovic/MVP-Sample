package com.garridovic.myappmvp.presentation.ui.activities;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.hannesdorfmann.mosby.mvp.MvpActivity;

import com.garridovic.myappmvp.presentation.MainView;
import com.garridovic.myappmvp.presentation.presenters.impl.MainViewPresenterImpl;
import com.iliberi.myappmvp.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends MvpActivity<MainView, MainViewPresenterImpl> implements MainView, View.OnClickListener{

    @OnClick(R.id.do_something_button) public void btnClick(Button v){
        getPresenter().loadSomething();
    }

    @Bind(R.id.content)
    TextView contentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @NonNull
    @Override
    public MainViewPresenterImpl createPresenter() {
        return new MainViewPresenterImpl();
    }

    @Override
    public void showSomething(List<String> something) {
        String texto = "";
        for(String item : something){
            texto = texto +"\n"+ item;
        }
        contentTextView.setText(texto);

    }

    @Override
    public void onClick(View v) {

    }


}
