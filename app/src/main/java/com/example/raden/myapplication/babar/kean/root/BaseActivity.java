package com.example.raden.myapplication.babar.kean.root;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.raden.myapplication.R;

/**
 * Created by Raden on 16/02/2018.
 */

public abstract class BaseActivity extends AppCompatActivity implements IBaseActivity {

    private final String TAG = getClass().getSimpleName();

    // All View Component
    private ProgressBar progressBarBaseView;
    private ProgressDialog progressDialog;
    private ViewGroup decorView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createView();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG, "onActivityResult: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void createView() {
        decorView  = (ViewGroup) getWindow().getDecorView();
        LayoutInflater.from(this).inflate(R.layout.progress_bar, decorView, true);
        progressBarBaseView = (ProgressBar) findViewById(R.id.progress_bar);
        progressBarBaseView.setVisibility(View.GONE);
    }


    @Override
    public Context baseContext() {
        return this;
    }

    @Override
    public AppCompatActivity baseActivity() {
        return this;
    }

    @Override
    public void showProgressBarDialog(String message) {
        if (null == progressDialog)
             addProgressBarDialog();
             progressDialog.setMessage(message);
        if (!progressDialog.isShowing())
             progressDialog.show();
    }

    private void addProgressBarDialog() {
        progressDialog = new ProgressDialog(this);
    }

    @Override
    public void showProgressBarDialog(String message, boolean cancelAble) {
        if (null == progressDialog)
            addProgressBarDialog();
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        if (!progressDialog.isShowing())
            progressDialog.show();
    }

    @Override
    public void showProgressBarDialog(String message, DialogInterface.OnCancelListener onCancelListener) {
        if (null == progressDialog)
            addProgressBarDialog();
        progressDialog.setOnCancelListener(onCancelListener);
        progressDialog.setMessage(message);
        if (!progressDialog.isShowing())
            progressDialog.show();
    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, String positive, DialogInterface.OnClickListener positiveListener) {
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setCancelable(cancelAble)
                .setPositiveButton(positive, positiveListener)
                .create().show();
    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, String positive, DialogInterface.OnClickListener positiveListener, String negative, DialogInterface.OnClickListener negativeListener) {
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setCancelable(cancelAble)
                .setPositiveButton(positive, positiveListener)
                .setNegativeButton(negative, negativeListener)
                .create().show();
    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, int drawable, String positive, DialogInterface.OnClickListener positiveListener, String negative, DialogInterface.OnClickListener negativeListener) {
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setCancelable(cancelAble).setIcon(drawable)
                .setPositiveButton(positive, positiveListener)
                .setNegativeButton(negative, negativeListener)
                .create().show();
    }

    @Override
    public void showAlertDialog(String message, boolean cancelAble, String positive, DialogInterface.OnClickListener positiveListener, String negative, DialogInterface.OnClickListener negativeListener) {
        new AlertDialog.Builder(this).setMessage(message).setCancelable(cancelAble)
                .setPositiveButton(positive, positiveListener)
                .setNegativeButton(negative, negativeListener)
                .create().show();
    }

    @Override
    public void showAlertDialog(String title, String message, boolean cancelAble, int drawable, String positive, DialogInterface.OnClickListener positiveListener) {
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setCancelable(cancelAble).setIcon(drawable)
                .setPositiveButton(positive, positiveListener)
                .create().show();
    }

    @Override
    public void showBaseProgressBar() {
        if (!progressBarBaseView.isShown())
            progressBarBaseView.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissBaseProgressBar() {
        if (progressBarBaseView.isShown())
            progressBarBaseView.setVisibility(View.GONE);
    }


    @Override
    public void dismissProgressBarDialog() {
        if (null == progressDialog)
            addProgressBarDialog();
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }
}
