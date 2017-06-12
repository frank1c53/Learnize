package com.coder.frank.learnize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

    }

    public void onSubject(View v)
    {
        Intent i=new Intent(this,Subjects.class);
        startActivity(i);
    }

    public void onBooks(View v)
    {
        Intent i=new Intent(this,Books.class);
        startActivity(i);
    }
}
