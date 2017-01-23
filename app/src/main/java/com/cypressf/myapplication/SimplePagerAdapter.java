package com.cypressf.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimplePagerAdapter extends FragmentPagerAdapter {
    public SimplePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Fragment 1";
        } else if (position == 1) {
            return "Fragment 2";
        } else {
            return "Undefined";
        }
    }

    @Override
    public Fragment getItem(int position) {
        return SimpleFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
