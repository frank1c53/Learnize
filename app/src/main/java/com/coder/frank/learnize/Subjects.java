package com.coder.frank.learnize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        String[] sub={"Physics",
                "Chemistry",
                "Biology",
                "Computer Science",
                "English",
                "Marathi"};
        String[] teacher={"Prof.Frank Fernandes",
                "Prof.Minakshi Patil",
                "Asst.Prof. Vivek Gandhi",
                "Prof. Umesh Yadav",
                "HOD.Franky Naidu",
                "HOD.Manpreet Kishan"};
        int[] subimg={
                R.drawable.s1,
                R.drawable.s2,
                R.drawable.s3,
                R.drawable.s4,
                R.drawable.s5,
                R.drawable.s6,

        };


        List<HashMap<String,String>> aList=new ArrayList<>();

        for(int i=0;i<6;i++)
        {
            HashMap<String,String> hm=new HashMap<>();
            hm.put("sub",sub[i]);
            hm.put("teach",teacher[i]);
            hm.put("img",Integer.toString(subimg[i]));
            aList.add(hm);

        }

        String[] from ={"img","sub","teach"};


        int[] to={R.id.iv1,R.id.tv1,R.id.tv2};

        ListAdapter adapter=new SimpleAdapter(getBaseContext(), aList,R.layout.custom_view,from,to);
        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.list_subjects);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String pos=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(Subjects.this,pos,Toast.LENGTH_LONG).show();
                        if(position==0)
                        {
                            Intent i=new Intent(view.getContext(),Sample.class);
                            startActivity(i);
                        }
                        if(position==1)
                        {
                            Intent i=new Intent(view.getContext(),Sample.class);
                            startActivity(i);
                        }
                        if(position==2)
                        {
                            Intent i=new Intent(view.getContext(),Sample.class);
                            startActivity(i);
                        }
                        if(position==3)
                        {
                            Intent i=new Intent(view.getContext(),Sample.class);
                            startActivity(i);
                        }
                    }
                }
        );
    }


}

