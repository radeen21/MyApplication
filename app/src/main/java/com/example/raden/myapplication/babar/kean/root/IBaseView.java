package com.example.raden.myapplication.babar.kean.root;

import android.content.Context;

/**
 * Created by Raden on 20/02/2018.
 */

public interface IBaseView {

    void createView(Context context);

    void showProgressBar();

    void dismissProgressBar();

    void dismissNoInternetConnection();

    void setActivity(BaseActivity appCompatActivity);

    BaseActivity getBaseActivity();

}
