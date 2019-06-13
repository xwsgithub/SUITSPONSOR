package com.example.suitsponsor.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainAdAdapter extends PagerAdapter {

    private Context context;
    private List<TextView> textViews;

    public MainAdAdapter(Context context, List<TextView> textViews){
        this.context=context;
        this.textViews = textViews;
    }


    @Override
    public int getCount() {
        if(textViews ==null){
            return 0;
        }else {
            return textViews.size();
        }
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(textViews.get(position));
        return textViews.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(textViews.get(position));
    }
}
