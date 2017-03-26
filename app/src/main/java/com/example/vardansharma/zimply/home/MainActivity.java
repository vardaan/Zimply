package com.example.vardansharma.zimply.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.vardansharma.zimply.R;
import com.example.vardansharma.zimply.base.BaseActivity;
import com.example.vardansharma.zimply.base.BaseFragment;
import com.example.vardansharma.zimply.experts.ExpertsFragment;
import com.example.vardansharma.zimply.product.ProductFragment;
import com.example.vardansharma.zimply.stories.StoryFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView (R.id.home_toolbar)
    Toolbar toolbar;
    @BindView (R.id.home_tablayout)
    TabLayout tablayout;
    @BindView (R.id.home_drawer)
    DrawerLayout drawer;
    @BindView (R.id.home_viewpager)
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(v -> drawer.openDrawer(GravityCompat.START));

        List<HomePagerItem> pagerItems = new ArrayList<>(3);
        pagerItems.add(new HomePagerItem(new ProductFragment(), "Products"));
        pagerItems.add(new HomePagerItem(new StoryFragment(), "Stories"));
        pagerItems.add(new HomePagerItem(new ExpertsFragment(), "Experts"));


        viewpager.setAdapter(new HomeAdapter(getSupportFragmentManager(), pagerItems));
        tablayout.post(() -> tablayout.setupWithViewPager(viewpager));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    class HomeAdapter extends FragmentStatePagerAdapter {

        private List<HomePagerItem> pagerItems;

        public HomeAdapter(FragmentManager fm, List<HomePagerItem> pagerItems) {
            super(fm);
            this.pagerItems = pagerItems;
        }

        @Override
        public Fragment getItem(int position) {
            return pagerItems.get(position).fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return pagerItems.get(position).title;
        }

        @Override
        public int getCount() {
            return pagerItems.size();
        }
    }

    class HomePagerItem {
        private BaseFragment fragment;
        private String title;

        public HomePagerItem(BaseFragment fragment, String title) {
            this.fragment = fragment;
            this.title = title;
        }
    }
}
