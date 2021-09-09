package com.example.bai2_buoi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycle;
    Data data;
    RecycleViewDataAdapter r_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle=findViewById(R.id.recycle);
        r_data = new RecycleViewDataAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recycle.setLayoutManager(linearLayoutManager);
        r_data.setData(getList());
        recycle.setAdapter(r_data);
    }

    private List<Data> getList() {
        List<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));

        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));


        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));


        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        arrayList.add(new Data(R.drawable.ic_layout3, R.drawable.ic_layout4, R.drawable.ic_layout5,R.drawable.ic_layout6,"To Kill a MockingBird"));
        return arrayList;
    }

}