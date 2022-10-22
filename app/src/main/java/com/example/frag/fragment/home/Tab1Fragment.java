package com.example.frag.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.frag.R;
import com.example.frag.fragment.itemTab1.Photo;
import com.example.frag.fragment.itemTab1.PhotoAdapter;

import java.util.ArrayList;
import java.util.List;


public class Tab1Fragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private ViewPager viewPager;
    private PhotoAdapter photoTab1Adapter;


    /*private Photo1Adapter phototab1Adapter;
    private RecyclerView rcvtab1;*/

    public Tab1Fragment() {
        // Required empty public constructor
    }

    public static Tab1Fragment newInstance(String param1, String param2) {
        Tab1Fragment fragment = new Tab1Fragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = view.findViewById(R.id.viewPagerTab1);

        photoTab1Adapter = new PhotoAdapter(getContext(),getListPhoto());
        viewPager.setAdapter(photoTab1Adapter);
    }

    private List<Photo> getListPhoto(){
        List<Photo> list = new ArrayList<>();

        list.add(new Photo(R.drawable.a1));
        list.add(new Photo(R.drawable.a2));
        list.add(new Photo(R.drawable.a3));
        list.add(new Photo(R.drawable.a4));
        list.add(new Photo(R.drawable.a5));

        return list;

    }
}