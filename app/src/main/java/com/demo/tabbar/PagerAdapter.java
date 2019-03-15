package com.demo.tabbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numfTabs;

    public PagerAdapter(FragmentManager fm, int numfTabs) {
        super(fm);
        this.numfTabs = numfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                TabFragment1 tb1 = new TabFragment1();
                return tb1;
            case 1:
                TabFragment2 tb2 = new TabFragment2();
                return tb2;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return numfTabs;
    }
}
