package com.sunline.rdp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.sunline.rdp.ui.fuzai.Dp2101;
import com.sunline.rdp.ui.fuzai.FragmentAuxiliaryInfo;
import com.sunline.rdp.ui.fuzai.FragmentBaseInfo;
import com.sunline.rdp.ui.fuzai.FragmentDesignatedAcco;
import com.sunline.rdp.ui.fuzai.FragmentInterestInfo;

/**
 * Created by Jay on 2015/8/31 0031.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private FragmentBaseInfo myFragment1 = null;
    private FragmentInterestInfo myFragment2 = null;
    private FragmentAuxiliaryInfo myFragment3 = null;
    private FragmentDesignatedAcco myFragment4 = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        myFragment1 = new FragmentBaseInfo();
        myFragment2 = new FragmentInterestInfo();
        myFragment3 = new FragmentAuxiliaryInfo();
        myFragment4 = new FragmentDesignatedAcco();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case Dp2101.PAGE_ONE:
                fragment = myFragment1;
                break;
            case Dp2101.PAGE_TWO:
                fragment = myFragment2;
                break;
            case Dp2101.PAGE_THREE:
                fragment = myFragment3;
                break;
            case Dp2101.PAGE_FOUR:
                fragment = myFragment4;
                break;
        }
        return fragment;
    }


}

