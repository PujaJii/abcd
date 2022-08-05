package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GvAdapter3 extends BaseAdapter {
        int[] imglong;
        Context context;
        LayoutInflater inflater;

    public GvAdapter3(Context applicationContext,int imglong[]){
            this.context = applicationContext;
            this.imglong = imglong;
            inflater = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return imglong.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.activity_gridview, null);
            ImageView icon = (ImageView) convertView.findViewById(R.id.grid_image);
            icon.setImageResource(imglong[position]);
            return convertView;
        }
    }

