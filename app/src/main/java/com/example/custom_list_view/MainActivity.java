package com.example.custom_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listId;

    String[] mainTitle ={
            "Student 1", "Student 2", "Student 3", "Student 4",
            "Student 5",
            "Student 6",
            "Student 7",
            "Student 8",
            "Student 9",
            "Student 10",
            "Student 11",
            "Student 12",
            "Student 13",
            "Student 14",
            "Student 15",
            "Student 16",
            "Student 17",
            "Student 18",
            "Student 19",
            "Student 20",
    };

    String[] subTitle ={
            "Computer",
            "Computer",
            "Computer",
            "Computer",
            "Computer",
            "Computer",
            "Computer",
            "Computer",
            "Computer",
            "Computer",
            "IT",
            "IT",
            "IT",
            "IT",
            "IT",
            "IT",
            "IT",
            "IT",
            "IT",
            "IT",
    };

    Integer[] imgId={
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,
            R.drawable.studentp,

    };
















    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        MyListAdapter adapter=new MyListAdapter(this, mainTitle, subTitle,imgId);
        listId=(ListView)findViewById(R.id.listId);
        listId.setAdapter(adapter);




    }
}