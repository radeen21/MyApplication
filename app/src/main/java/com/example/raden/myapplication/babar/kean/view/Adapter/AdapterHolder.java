package com.example.raden.myapplication.babar.kean.view.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Raden on 20/02/2018.
 */

public class AdapterHolder extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public AdapterHolder(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
        System.out.println("COUNT FRAGMENT = " + fragments.size());
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
