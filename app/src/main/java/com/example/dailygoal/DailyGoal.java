package com.example.dailygoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DailyGoal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_goal);

        Button btn = (Button) findViewById(R.id.buttonNext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Get RadioGroup object
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.RadioGroup);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.RadioGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.RadioGroup3);
                EditText reflection = (EditText) findViewById(R.id.editTextReflection);
                TextView tvRead = (TextView) findViewById(R.id.TextViewRead);
                TextView tvArrive = (TextView) findViewById(R.id.textViewArrive);
                TextView tvAttempt = (TextView) findViewById(R.id.textViewAttempt);

                // get id of selected radio button in radiogroup
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                // get radio button object from id we had gotten above
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);

                // put into array
                String[] info = {tvRead.getText().toString(), rb1.getText().toString(), tvArrive.getText().toString(), rb2.getText().toString(), tvAttempt.getText().toString(), rb3.getText().toString(), reflection.getText().toString()};

                // create an intent to start another activity called
                // DemoActivities (which he would create later)
                Intent i = new Intent(DailyGoal.this, Summary.class);

                // pass the string array holding the name and age into new activity
                i.putExtra("info", info);

                // start new activity
                startActivity(i);

            }
        });

    }
}
