package com.androco.researjour.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androco.researjour.R;

import java.util.ArrayList;

public class SubjectAdapter extends  RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>{
    private ArrayList<SubjectName> subjectNamesList;

    public SubjectAdapter(ArrayList<SubjectName> subjectNamesList, Context context, int layout) {
        this.subjectNamesList = subjectNamesList;
        this.context = context;
        this.layout = layout;
    }

    private Context context;
    private  int layout;


    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SubjectViewHolder(LayoutInflater.from(context).inflate(layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {

        holder.subName.setText(subjectNamesList.get(position).getSubjectName());
        holder.checkBox.setChecked(subjectNamesList.get(position).isChecked());

    }

    @Override
    public int getItemCount() {
        return subjectNamesList.size();
    }

    public class  SubjectViewHolder extends RecyclerView.ViewHolder {
     public TextView subName;
     public CheckBox checkBox;
     public SubjectViewHolder(@NonNull View itemView) {
         super(itemView);
         subName=itemView.findViewById(R.id.subNameTV);
         checkBox=itemView.findViewById(R.id.checkBox);
     }
 }
}
