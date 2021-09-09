package com.example.bai2_buoi4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleViewDataAdapter extends RecyclerView.Adapter<MyViewHolder> {
    public List<Data> Datalist;
    public Context context;

    public RecycleViewDataAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Data> list) {
        this.Datalist = list;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout1, parent, false);
        MyViewHolder ViewHolder = new MyViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Data file = (Data) Datalist.get(position);
        holder.img_1.setImageResource(file.getImg1());
        holder.img_2.setImageResource(file.getImg2());
        holder.img_3.setImageResource(file.getImg3());
        holder.img_4.setImageResource(file.getImg4());
        holder.text.setText(file.getTxt());

    }


    @Override
    public int getItemCount() {
        return Datalist.size();
    }



}



