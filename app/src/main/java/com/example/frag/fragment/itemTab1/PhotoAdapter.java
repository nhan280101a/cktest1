package com.example.frag.fragment.itemTab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.frag.R;

import java.util.List;

public class PhotoAdapter  extends PagerAdapter {

    private Context context;
    private List<Photo> listPhoto;

    public PhotoAdapter(Context context, List<Photo> listPhoto) {
        this.context = context;
        this.listPhoto = listPhoto;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.slider_photo, container,false);
        ImageView img_slider =view.findViewById(R.id.img_slider);

        Photo photo = listPhoto.get(position);
        if (photo !=null){
            Glide.with(context).load(photo.getResourceId()).into(img_slider);

        }

        //Add view in viewgroup
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return listPhoto.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        //Remove view
        container.removeView((View) object);
    }
}
