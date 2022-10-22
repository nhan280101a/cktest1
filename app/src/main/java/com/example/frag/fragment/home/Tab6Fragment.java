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


public class Tab6Fragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private ViewPager viewPager;
    private PhotoAdapter photoTab6Adapter;

    public Tab6Fragment() {
        // Required empty public constructor
    }

    public static Tab6Fragment newInstance(String param1, String param2) {
        Tab6Fragment fragment = new Tab6Fragment();
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
        return inflater.inflate(R.layout.fragment_tab6, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = view.findViewById(R.id.viewPagerTab6);

        photoTab6Adapter = new PhotoAdapter(getContext(),getListPhoto());
        viewPager.setAdapter(photoTab6Adapter);
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