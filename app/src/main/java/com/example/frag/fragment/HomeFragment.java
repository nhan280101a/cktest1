package com.example.frag.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.frag.R;
import com.example.frag.fragment.home.HomeViewPagerAdapter;
import com.example.frag.fragment.home1.Home1ViewPagerAdapter;
import com.example.frag.fragment.home2.Home2ViewPagerAdapter;
import com.example.frag.fragment.itemTab1.Photo;
import com.example.frag.fragment.itemTab1.PhotoAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TabLayout tabLayout, tabLayout1, tabLayout2;
    private ViewPager viewPager, viewPager1, viewPager2;

    private View mView;
    private ArrayList<Photo> ArrayList1, ArrayList2, ArrayList3;


    private List<Photo> listitem,listitem2,listitem3;

    private PhotoAdapter photoTab1Adapter;

    RecyclerView myrecycleview,myrecycleview1,myrecycleview2;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_home, container, false);


        /*tabLayout = mView.findViewById(R.id.tab1layout1);
        myrecycleview = mView.findViewById(R.id.home1_viewpager1);
        HomeViewPagerAdapter adapter = new HomeViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        myrecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecycleview.setAdapter(adapter);*/



        tabLayout = mView.findViewById(R.id.tab1layout1);
        viewPager = mView.findViewById(R.id.home1_viewpager1);
        HomeViewPagerAdapter adapter = new HomeViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout1 = mView.findViewById(R.id.tab1layout2);
        viewPager1 = mView.findViewById(R.id.home1_viewpager2);
        Home1ViewPagerAdapter adapter1 = new Home1ViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager1.setAdapter(adapter1);
        tabLayout1.setupWithViewPager(viewPager1);

        tabLayout2 = mView.findViewById(R.id.tab1layout3);
        viewPager2 = mView.findViewById(R.id.home1_viewpager3);
        Home2ViewPagerAdapter adapter2 = new Home2ViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager2.setAdapter(adapter2);
        tabLayout2.setupWithViewPager(viewPager2);
        return mView;
    }


}
