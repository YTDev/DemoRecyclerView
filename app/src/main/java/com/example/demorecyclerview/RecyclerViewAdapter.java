package com.example.demorecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CatViewHolder> {
    ArrayList<Cat> cats;

    public RecyclerViewAdapter(ArrayList<Cat> cats) {
        this.cats = cats;
    }


    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_custom,null,false);
        CatViewHolder catViewHolder =new CatViewHolder(view);
        return catViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat=cats.get(position);
        holder.img.setImageResource(cat.getImg());
        holder.txt.setText(cat.getName());
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    class CatViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txt;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            txt=itemView.findViewById(R.id.txt);

        }
    }
}
