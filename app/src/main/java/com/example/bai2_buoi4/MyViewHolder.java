package com.example.bai2_buoi4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {


    public ImageView img_1;
    public ImageView img_2;
    public ImageView img_3;
    public ImageView img_4;
    public TextView text;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img_1 = itemView.findViewById(R.id.img_1);
        img_2 = itemView.findViewById(R.id.img_2);
        img_3 = itemView.findViewById(R.id.img_3);
        img_4 = itemView.findViewById(R.id.img_4);
        text = itemView.findViewById(R.id.text);

    }
}
