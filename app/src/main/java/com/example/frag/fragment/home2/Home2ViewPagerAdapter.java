package com.example.frag.fragment.home2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Home2ViewPagerAdapter extends FragmentPagerAdapter {


    public Home2ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab10Fragment();
            case 1:
                    return new Tab11Fragment();
            case 2:
                return new Tab12Fragment();
            case 3:
                return new Tab13Fragment();
            case 4:
                return new Tab14Fragment();
            default: return new Tab10Fragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Hàn Quốc";
            case 1:
                return "Nhật Bản";
            case 2:
                return "Singapore";
            case 3:
                return "Thái Lan";
            case 4:
                return "Bali";
            default:
                return  "Hàn Quốc";
        }
    }
}
