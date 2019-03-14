package com.demo.tabbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Adapter;

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
            case 2:
                TabFragment3 tb3 = new TabFragment3();
                return tb3;
            case 3:
                TabFragment4 tb4 = new TabFragment4();
                return tb4;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return numfTabs;
    }
}
