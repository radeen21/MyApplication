package com.example.raden.myapplication.babar.kean.mvp.howto;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raden.myapplication.R;
import com.example.raden.myapplication.babar.kean.root.BaseFragment;

/**
 * Created by Raden on 20/02/2018.
 */

public class HowToFragment extends BaseFragment {

    private Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_how_to,null,false);
        return view;
    }
}
