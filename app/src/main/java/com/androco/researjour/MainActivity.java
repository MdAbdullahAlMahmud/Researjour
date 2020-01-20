package com.androco.researjour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner genderspinnerm,dateofbirthspinner;
    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genderspinnerm=findViewById(R.id.gender_spinner);
        dateofbirthspinner=findViewById(R.id.date_of_birthSpinner);
        nextBtn=findViewById(R.id.nextBtn);

        ArrayAdapter<CharSequence> arrayAdapter=ArrayAdapter.createFromResource(this,R.array.gender,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderspinnerm.setAdapter(arrayAdapter);

        ArrayAdapter<CharSequence> birthAdapter=ArrayAdapter.createFromResource(this,R.array.date,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dateofbirthspinner.setAdapter(birthAdapter);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,CategorySelectionActivity.class);
                startActivity(intent);

            }
        });

    }
}
