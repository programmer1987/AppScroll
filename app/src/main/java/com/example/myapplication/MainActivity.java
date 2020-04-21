package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //which layout to use when app runs
        /*in the case in which the user clicks:
         Keyboard overlays the text to solve it search in the layout view scrollbar and then set vertical true */
        setContentView(R.layout.note_layout);
    }
}
