package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String[] list ={
            "This the short note.",
            "This is the a quite long note",
    };
    ArrayList arrayList =  new ArrayList<>(Arrays.asList(list));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        ListView noteList = findViewById(R.id.noteListView);
        noteList.setAdapter(arrayAdapter);

        EditText et = findViewById(R.id.editText3);
        et.setBackgroundColor(Color.MAGENTA);//set black background color of input box
    }

    // press the "New" button to show input activity
    public void newNote(View v){
        EditText et = findViewById(R.id.editText3);
        et.setText("");
        findViewById(R.id.editText3).setVisibility(View.VISIBLE);
        findViewById(R.id.cancel).setVisibility(View.VISIBLE);
        findViewById(R.id.clear).setVisibility(View.VISIBLE);
        findViewById(R.id.add).setVisibility(View.VISIBLE);
    }
    //cancel the input
    public void cancel(View view) {
        findViewById(R.id.editText3).setVisibility(View.INVISIBLE);
        findViewById(R.id.cancel).setVisibility(View.INVISIBLE);
        findViewById(R.id.clear).setVisibility(View.INVISIBLE);
        findViewById(R.id.add).setVisibility(View.INVISIBLE);
    }

    // edit the note: "clear"
    public void clear(View v){
        EditText et = findViewById(R.id.editText3);
        et.setText("");
    }

    // edit the note: "add"
    public void add(View v){
        EditText et = findViewById(R.id.editText3);
        String note = et.getText() + "";
        arrayList.add(note);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        ListView noteList = findViewById(R.id.noteListView);
        noteList.setAdapter(arrayAdapter);
        cancel(v);
    }

}
