package com.example.myapplication;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class GvAdapter extends RecyclerView.Adapter<GvAdapter.ViewHolder>{
    ArrayList nameList;
    ArrayList personImages;
    Context context;


    public GvAdapter(ArrayList nameList,ArrayList personImages, Context context){
        this.nameList = nameList;
        this.personImages = personImages;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(nameList.get(position).toString());
        holder.imageView.setImageResource((Integer)personImages.get((position)));
    }


    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView4);
            textView = view.findViewById(R.id.textView8);

            //textView.setText(nameList.get(getAbsoluteAdapterPosition()).toString());

        }
    }
}
