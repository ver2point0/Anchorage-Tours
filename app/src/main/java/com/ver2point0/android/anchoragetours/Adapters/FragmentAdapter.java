package com.ver2point0.android.anchoragetours.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ver2point0.android.anchoragetours.Fragments.EatsFragment;
import com.ver2point0.android.anchoragetours.Fragments.HotelsFragment;
import com.ver2point0.android.anchoragetours.Fragments.MuseumsFragment;
import com.ver2point0.android.anchoragetours.Fragments.ParksFragment;
import com.ver2point0.android.anchoragetours.R;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new EatsFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new MuseumsFragment();
            case 3:
                return new ParksFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return mContext.getString(R.string.category_eats);
            case 1:
                return mContext.getString(R.string.category_hotels);
            case 2:
                return mContext.getString(R.string.category_museums);
            case 3:
                return mContext.getString(R.string.category_parks);
            default:
                return null;
        }
    }
}
