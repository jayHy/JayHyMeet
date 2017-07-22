package kr.co.jayhy.meet.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

import kr.co.jayhy.meet.MainFragment;
import kr.co.jayhy.meet.common.CommonValues;

/**
 * Created by jhkim on 2017-07-02.
 */

public class MainFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private int totCount = 0;

    public MainFragmentPagerAdapter(FragmentManager fm, int totCount) {
        super(fm);

//        Log.d(CommonValues.TAG, "MainFragmentPagerAdapter totCount ==> " + totCount);

        this.totCount = totCount;
    }

    @Override
    public Fragment getItem(int position) {

        MainFragment mainFragment = null;

        Log.d("jayHy", "111");

        Log.d(CommonValues.TAG, "MainFragmentPagerAdapter position ==> " + position);

        switch(position) {
            case 0:
                mainFragment = new MainFragment();
                mainFragment.newInstance(position);

                return mainFragment;

            case 1:
                mainFragment = new MainFragment();
                mainFragment.newInstance(position);

                return mainFragment;
            case 2:
                mainFragment = new MainFragment();
                mainFragment.newInstance(position);

                return mainFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totCount;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
