package com.androco.researjour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.androco.researjour.Model.Category;
import com.androco.researjour.Model.CategoryAdapter;
import com.androco.researjour.Model.SubjectAdapter;
import com.androco.researjour.Model.SubjectName;

import java.util.ArrayList;

public class ChooseYourSubjectActivity extends AppCompatActivity {

    RecyclerView chooseSubjectRecycleView;

    ArrayList<SubjectName> arrayList=new ArrayList<SubjectName>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_subject);
        chooseSubjectRecycleView=findViewById(R.id.chooseSubjectRecycleView);


        arrayList.add(new SubjectName("Accounting",true));
        arrayList.add(new SubjectName("Accounting",true));
        arrayList.add(new SubjectName("Accounting",false));
        arrayList.add(new SubjectName("Accounting",true));
        arrayList.add(new SubjectName("Accounting",false));
        arrayList.add(new SubjectName("Accounting",true));
        arrayList.add(new SubjectName("Accounting",false));
        arrayList.add(new SubjectName("Accounting",true));
        arrayList.add(new SubjectName("Accounting",false));
        arrayList.add(new SubjectName("Accounting",true));


        SubjectAdapter adapter =new SubjectAdapter(arrayList,this,R.layout.choosesubject);
        chooseSubjectRecycleView.setLayoutManager(new LinearLayoutManager(this));
        chooseSubjectRecycleView.setHasFixedSize(true);
        chooseSubjectRecycleView.setAdapter(adapter);
    }
}
