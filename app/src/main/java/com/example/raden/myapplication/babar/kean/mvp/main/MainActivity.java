package com.example.raden.myapplication.babar.kean.mvp.main;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.raden.myapplication.R;
import com.example.raden.myapplication.babar.kean.helper.Constant;
import com.example.raden.myapplication.babar.kean.mvp.home.HomeActivity;
import com.example.raden.myapplication.babar.kean.mvp.home.HomeFragment;
import com.example.raden.myapplication.babar.kean.mvp.howto.HowToFragment;
import com.example.raden.myapplication.babar.kean.mvp.profile.ProfileFragment;
import com.example.raden.myapplication.babar.kean.root.BaseActivity;
import com.example.raden.myapplication.babar.kean.root.BaseFragment;
import com.example.raden.myapplication.babar.kean.view.Adapter.AdapterHolder;
import com.viewpagerindicator.TitlePageIndicator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.internal.Utils;

public class MainActivity extends BaseActivity {

    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.page_indicator)
    TitlePageIndicator pageIndicator;
    @BindView(R.id.mn_rel_home)
    RelativeLayout relHome;
    @BindView(R.id.mn_rel_how)
    RelativeLayout relHowTo;
    @BindView(R.id.mn_rel_profile)
    RelativeLayout relProfile;
    @BindView(R.id.txt_home)
    TextView txtHome;
    @BindView(R.id.txt_how)
    TextView txtHowTo;
    @BindView(R.id.txt_profile)
    TextView txtProfile;
    @BindView(R.id.toolbar_main)
    Toolbar toolbarMain;

    private Context context;
    public HomeFragment homeFragment;
    private HowToFragment howToFragment;
    private ProfileFragment profileFragment;
    private AdapterHolder mAdapter;
    private boolean  isAlreadyChangedView;

    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            setCurrentItemHeader(position);
            isAlreadyChangedView = true;
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = this;
        declareView();
    }

    public void declareView(){

        homeFragment = new HomeFragment();
        howToFragment = new HowToFragment();
        profileFragment = new ProfileFragment();

        mAdapter = new AdapterHolder(getSupportFragmentManager(),getFragment());
        pager.setAdapter(mAdapter);

        pager.addOnPageChangeListener(pageChangeListener);
        relHome.setOnClickListener(new HeaderListener(Constant.POS_HOME));
        relHowTo.setOnClickListener(new HeaderListener(Constant.POS_DISCOVER));
        relProfile.setOnClickListener(new HeaderListener(Constant.POS_LUCKY_DRAW));

        relHome.setSelected(true);

    }

    private List<Fragment> getFragment(){
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(homeFragment);
        fragmentList.add(howToFragment);
        fragmentList.add(profileFragment);
        return fragmentList;
    }

    private void setCurrentItemHeader(int position){
        relHome.setSelected(position == 0);
        relHowTo.setSelected(position == 1);
        relProfile.setSelected(position == 2);
    }

    private class HeaderListener implements View.OnClickListener {
        private int position;

        HeaderListener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            if (pager != null && pager.getCurrentItem() != position) {
                pager.setCurrentItem(position);
            }
        }
    }
}
