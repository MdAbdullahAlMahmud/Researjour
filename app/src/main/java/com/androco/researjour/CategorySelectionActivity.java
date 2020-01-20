package com.androco.researjour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androco.researjour.Model.Category;
import com.androco.researjour.Model.CategoryAdapter;

import java.util.ArrayList;

public class CategorySelectionActivity extends AppCompatActivity {

    ArrayList<Category> arrayList=new ArrayList<Category>();
    RecyclerView recyclerView;

    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);

        recyclerView=findViewById(R.id.recycleViewCategory);
        nextBtn=findViewById(R.id.category_Selection_next_btn);

        arrayList.add(new Category("Medical & Health",R.drawable.madicalhealth));
        arrayList.add(new Category("Life Science & Biology",R.drawable.lifesciencebiology));
        arrayList.add(new Category("Chemistry & Material Science",R.drawable.chemistrymateriascience));
        arrayList.add(new Category("Engineering & Computer Science",R.drawable.engineering_co_puter_science));
        arrayList.add(new Category("Social Science & Phychology",R.drawable.socialsciencephychology));
        arrayList.add(new Category("Earth Science & Geography",R.drawable.earth_science_geography));
        arrayList.add(new Category("Physics & Mathematics",R.drawable.physicsmathmatics));
        arrayList.add(new Category("Medical & Health",R.drawable.madicalhealth));
        arrayList.add(new Category("Life Science & Biology",R.drawable.lifesciencebiology));
        arrayList.add(new Category("Chemistry & Material Science",R.drawable.chemistrymateriascience));
        arrayList.add(new Category("Engineering & Computer Science",R.drawable.engineering_co_puter_science));
        arrayList.add(new Category("Social Science & Phychology",R.drawable.socialsciencephychology));


        CategoryAdapter adapter =new CategoryAdapter(arrayList,this,R.layout.categorydesign);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategorySelectionActivity.this,ChooseYourSubjectActivity.class));
            }
        });



    }
}
