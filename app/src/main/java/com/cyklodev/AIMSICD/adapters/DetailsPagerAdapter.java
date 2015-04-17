package com.cyklodev.AIMSICD.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cyklodev.AIMSICD.R;
import com.cyklodev.AIMSICD.fragments.CellInfoFragment;
import com.cyklodev.AIMSICD.fragments.DbViewerFragment;
import com.cyklodev.AIMSICD.fragments.DeviceFragment;

/**
 * Adapter to allow swiping between various detail fragments
 */
public class DetailsPagerAdapter extends FragmentPagerAdapter {
    Context context;

    public DetailsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new DeviceFragment();
            case 1: return new CellInfoFragment();
            case 2: return new DbViewerFragment();
        }

        return new DeviceFragment();
    }

    @Override
    public long getItemId(int position) {
        // map position to position in AIMSICD.getNavDrawerConfiguration
        switch (position) {
            case 0: return 4;
            case 1: return 5;
            case 2: return 7;
        }

        return -1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return context.getString(R.string.device_info);
            case 1: return context.getString(R.string.cell_info_title);
            case 2: return context.getString(R.string.db_viewer);
        }

        return "";
    }

    @Override
    public int getCount() {
        return 3;
    }
}
