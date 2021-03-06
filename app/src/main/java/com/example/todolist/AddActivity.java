package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ListView;

public class AddActivity extends AppCompatActivity {
    String[] toDo = {"Nugas", "Makan", "Mandi", "Rebahan", "Olahraga", "Ngedate"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.activity_list, toDo);
        ListView listView = (ListView) findViewById(R.id.itemListView);
        listView.setAdapter(listAdapter);
    }
}