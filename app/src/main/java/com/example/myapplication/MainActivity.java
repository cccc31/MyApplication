package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // set the activity when press the button
    public void buttonPress(View v){
        EditText et = findViewById(R.id.editText);
        // clear text
        et.setText("");
    }

    public void lab8(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
