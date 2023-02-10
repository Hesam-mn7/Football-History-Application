package com.example.footballihesam.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.footballihesam.R;
import com.example.footballihesam.entity.More;

import java.util.ArrayList;

public class CustomAdaptorVideo extends BaseAdapter {

    private Context context;
    private ArrayList<More> arrayList;

    public CustomAdaptorVideo(Context context, ArrayList<More> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View View, ViewGroup parent) {

        if (View == null){
            View = LayoutInflater.from(context).inflate(R.layout.listview_video_layout,null);
            More video = arrayList.get(position);
            TextView tvvideo = View.findViewById(R.id.tvvideo);
            ImageView imgvideo = View.findViewById(R.id.imgvideo);

            tvvideo.setText(video.getTitle());
            imgvideo.setImageResource(video.getImg());
        }
        return View;
    }
}

