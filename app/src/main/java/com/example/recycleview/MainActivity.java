package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);
    }

    private void setData()
    {
        movies.add(new Model(R.drawable.sendi, "Сэнди"));
        movies.add(new Model(R.drawable.mister, "Мистер П."));
    }
}