package com.example.raden.myapplication.babar.kean.root;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/**
 * Created by Raden on 20/02/2018.
 */

public abstract class BaseView extends RelativeLayout implements IBaseView{

    private BaseActivity baseActivity;

    //*** View Component ***
    private ProgressBar progressBar;

    public BaseView(Context context) {
        super(context);
    }

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BaseView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void createView(Context context) {

    }

    @Override
    public void showProgressBar() {
        if(progressBar == null)
            progressBar.setVisibility(VISIBLE);
    }

    @Override
    public void dismissProgressBar() {

    }

    @Override
    public void dismissNoInternetConnection() {

    }

    @Override
    public void setActivity(BaseActivity appCompatActivity) {
        this.baseActivity = baseActivity;
    }

    @Override
    public BaseActivity getBaseActivity() {
        return baseActivity;
    }
}
