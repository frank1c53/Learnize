package com.coder.frank.learnize;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class AddStudent extends AppCompatActivity {
    private DatabaseReference mDatabase;
    String n,e,ph,r,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("StudentDetails");

    }

    public void onSubmit(View v)
    {
        EditText name = (EditText) findViewById(R.id.name);
        EditText email= (EditText) findViewById(R.id.email);
        EditText phone = (EditText) findViewById(R.id.phone);
        EditText rollno = (EditText) findViewById(R.id.rollno);
        EditText course = (EditText) findViewById(R.id.course);
        n= name.getText().toString().trim();
        e= email.getText().toString().trim();
        ph= phone.getText().toString().trim();
        r= rollno.getText().toString().trim();
        c= course.getText().toString().trim();

        HashMap<String,String> datamap=new HashMap<>();
        datamap.put("name",n);
        datamap.put("email",e);
        datamap.put("phone",ph);
        datamap.put("rollno",r);
        datamap.put("course",c);

        mDatabase.push().setValue(datamap).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(AddStudent.this,"Details Added Successfully",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(AddStudent.this,"Error:Check for Connectivity",Toast.LENGTH_LONG).show();
                }


            }
        });



    }
}
