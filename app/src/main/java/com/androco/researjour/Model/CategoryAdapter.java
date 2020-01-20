package com.androco.researjour.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androco.researjour.R;

import java.util.ArrayList;

public class CategoryAdapter extends  RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{

    public CategoryAdapter(ArrayList<Category> categoryArrayList, Context context,int layout) {
        this.categoryArrayList = categoryArrayList;
        this.context = context;
        this.layout=layout;
    }

    public ArrayList<Category> categoryArrayList;
    public Context context;
    public  int layout;

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view= LayoutInflater.from(context).inflate(layout,parent,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.imageView.setImageResource(categoryArrayList.get(position).getCategoryImage());
        holder.categoryName.setText(categoryArrayList.get(position).getCategoryName());


    }

    @Override
    public int getItemCount() {
        return categoryArrayList.size();
    }


    public  class CategoryViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView categoryName;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.categoryImage);
            categoryName=itemView.findViewById(R.id.categoryText);
        }
    }
}
