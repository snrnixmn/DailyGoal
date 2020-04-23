package com.example.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Get intent so as to get the "things" inside intent

        Intent i = getIntent();

        // get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");

        // get TextView object
        TextView tv1 = findViewById(R.id.textViewSummary);

        // display the name and age on TextView
        tv1.setText(info[0] + " : " + info[1] + "\n" + info[2] + " : " + info[3] + "\n"  +  info[4] + " : " + info[5] + "\n"  +  "Reflection: " + info[6]);
    }
}
