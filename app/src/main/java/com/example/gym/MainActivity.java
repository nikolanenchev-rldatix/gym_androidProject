package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[];
    int images[]= {R.drawable.chest,R.drawable.back,R.drawable.biceps,
            R.drawable.triceps,R.drawable.shoulder,R.drawable.legs,
            R.drawable.abs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.muscle_groups);

        MyAdapter myAdapter= new MyAdapter(this, s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}