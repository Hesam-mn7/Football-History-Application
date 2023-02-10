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


public class CustomAdaptorMore extends BaseAdapter {

    private Context context;
    private ArrayList<More> arrayList;

    public CustomAdaptorMore(Context context, ArrayList<More> arrayList) {
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

        if(View == null){
            View = LayoutInflater.from(context).inflate(R.layout.listview_layout,null);
            More book = arrayList.get(position);
            TextView tvbook = View.findViewById(R.id.tvbook);
            ImageView imgbook = View.findViewById(R.id.imgbook);

            tvbook.setText(book.getTitle());
            imgbook.setImageResource(book.getImg());
        }
        return View;
    }
}
