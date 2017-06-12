package com.coder.frank.learnize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        String[] bk={"Physics for Dummies",
                "C Complete Reference",
                "Java Complete Reference",
                "Metallurgy",
                "English Grammar and Compostion",
                "मराठी साहित्य"};
        String[] author={"PhD.Steven Holzner",
                "Bell Labs:Dennis Richie",
                "Mr.James Goslin",
                "Prof. Vijay Deshmukh",
                "Mr.Bayer",
                "Phd.Sukanya Kale"};
        int[] subimg={
                R.drawable.b1,
                R.drawable.b2,
                R.drawable.b3,
                R.drawable.b4,
                R.drawable.b5,
                R.drawable.b6,

        };


        List<HashMap<String,String>> aList=new ArrayList<>();

        for(int i=0;i<6;i++)
        {
            HashMap<String,String> hm=new HashMap<>();
            hm.put("bk",bk[i]);
            hm.put("author",author[i]);
            hm.put("img",Integer.toString(subimg[i]));
            aList.add(hm);

        }

        String[] from ={"img","bk","author"};


        int[] to={R.id.iv1,R.id.tv1,R.id.tv2};

        ListAdapter adapter=new SimpleAdapter(getBaseContext(), aList,R.layout.custom_view,from,to);
        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.list_books);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);
    }
}
