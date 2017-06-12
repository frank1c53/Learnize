package com.coder.frank.learnize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teach_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teach_);
    }

    public void onAdd(View v)
    {
        Intent i=new Intent(this,AddStudent.class);
        startActivity(i);
    }

    public void onDisplay(View v)
    {
        Intent i=new Intent(this,DisplayDetails.class);
        startActivity(i);
    }
    public void onSubject(View v)
    {
        Intent i=new Intent(this,Subjects.class);
        startActivity(i);
    }
}