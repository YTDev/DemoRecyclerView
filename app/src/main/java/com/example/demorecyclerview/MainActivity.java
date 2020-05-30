package com.example.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        ArrayList<Cat> cats=new ArrayList<>();
        cats.add(new Cat(R.drawable.fr,"France"));
        cats.add(new Cat(R.drawable.ger,"Germany"));
        cats.add(new Cat(R.drawable.usa,"USA"));
        cats.add(new Cat(R.drawable.icon1,"ICON 1"));
        cats.add(new Cat(R.drawable.icon3,"ICON 3"));
        cats.add(new Cat(R.drawable.icon4,"ICON 4"));

        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(cats);

//        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        RecyclerView.LayoutManager manager=new GridLayoutManager(this,3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
