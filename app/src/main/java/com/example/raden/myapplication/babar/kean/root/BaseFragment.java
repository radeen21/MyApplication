package com.example.raden.myapplication.babar.kean.root;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Raden on 19/02/2018.
 */

public abstract class BaseFragment extends Fragment implements IBaseActivity {

    private ProgressDialog  progressDialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        progressDialog = new ProgressDialog(getContext());
    }

    @Override
    public AppCompatActivity baseActivity() {
        return null;
    }

    @Override
    public Context baseContext() {
        return null;
    }

    @Override
    public void createView() {

    }

    @Override
    public void showProgressBarDialog(String message) {

    }

    @Override
    public void showProgressBarDialog(String message, boolean cancelAble) {

    }

    @Override
    public void showProgressBarDialog(String message, DialogInterface.OnCancelListener onCancelListener) {

    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, String positive, DialogInterface.OnClickListener positiveListener) {

    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, String positive, DialogInterface.OnClickListener positiveListener, String negative, DialogInterface.OnClickListener negativeListener) {

    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, int drawable, String positive, DialogInterface.OnClickListener positiveListener, String negative, DialogInterface.OnClickListener negativeListener) {

    }

    @Override
    public void showAlertDialog(String message, boolean cancelAble, String positive, DialogInterface.OnClickListener positiveListener, String negative, DialogInterface.OnClickListener negativeListener) {

    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, int drawable, String positive, DialogInterface.OnClickListener positiveListener) {

    }

    @Override
    public void showBaseProgressBar() {

    }

    @Override
    public void dismissBaseProgressBar() {

    }

    @Override
    public void dismissProgressBarDialog() {

    }
}
