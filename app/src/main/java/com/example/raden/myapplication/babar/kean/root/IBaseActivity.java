package com.example.raden.myapplication.babar.kean.root;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Raden on 19/02/2018.
 */

public interface IBaseActivity {

    AppCompatActivity baseActivity();

    Context baseContext();

    void createView();

    void showProgressBarDialog(String message);

    void showProgressBarDialog(String message,boolean cancelAble );

    void showProgressBarDialog(String message, DialogInterface.OnCancelListener onCancelListener);

    void showAlertDialog(String title,
                         String message,
                         boolean cancelAble,
                         String positive,
                         DialogInterface.OnClickListener positiveListener);

    void showAlertDialog(String title,
                         String message,
                         boolean cancelAble,
                         String positive,
                         DialogInterface.OnClickListener positiveListener,
                         String negative,
                         DialogInterface.OnClickListener negativeListener);

    void showAlertDialog(String title,
                         String message,
                         boolean cancelAble,
                         int drawable,
                         String positive,
                         DialogInterface.OnClickListener positiveListener,
                         String negative,
                         DialogInterface.OnClickListener negativeListener);

    void showAlertDialog(String message,
                         boolean cancelAble,
                         String positive,
                         DialogInterface.OnClickListener positiveListener,
                         String negative,
                         DialogInterface.OnClickListener negativeListener);

    void showAlertDialog(String title,
                         String message,
                         boolean cancelAble,
                         int drawable,
                         String positive,
                         DialogInterface.OnClickListener positiveListener);

    void showBaseProgressBar();

    void dismissBaseProgressBar();

    void dismissProgressBarDialog();

//    void showDialogPermission(int requestCode, OnDialogPermissionsListener onDialogPermissionsListener);
//
//    void showNotificationMessage(String message);
//
//    void dismissNotificationMessage();
//
//    void showNoInternetConnection();
//
//    void dismissNoInternetConnection();
//
//    interface OnDialogPermissionsListener {
//
//        void onAllow(int requestCode);
//
//        void onDeny();
//    }

}
