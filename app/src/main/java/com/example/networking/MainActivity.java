package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Mountain> mountainArrayList=new ArrayList<>();
    ArrayAdapter<Mountain> adapter=new ArrayAdapter<Mountain>(this,R.layout.test,R.id.textview2,mountainArrayList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}



