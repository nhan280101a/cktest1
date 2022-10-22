package com.example.frag.fragment.home1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Home1ViewPagerAdapter extends FragmentPagerAdapter {


    public Home1ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab7Fragment();
            case 1:
                    return new Tab8Fragment();
            case 2:
                return new Tab9Fragment();
            default: return new Tab7Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tour tham quan";
            case 1:
                return "Tour thiên nhiên";
            case 2:
                return "Tour biển";
            default:
                return  "Tour tham quan";
        }
    }
}
