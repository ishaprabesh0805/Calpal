package com.example.calpal.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calpal.R;

public class CalendarActivity extends AppCompatActivity {
    private static final String TAG = "CalendarActivity";
    private Button mAddEventButton;
    private CalendarView mCalendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // setting up
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        // defining variables
        mCalendarView = (CalendarView) findViewById(R.id.calendar);
        mAddEventButton = (Button) findViewById(R.id.addEventButton);

        // Button listeners
        mAddEventButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.addEventButton:
                        break;
                }
            }

        });

        /*
        //when user selects a day; callback
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView CalendarView, int year, int month, int dayOfMonth) {
                String date = year + "/" + month + "/"+ dayOfMonth ;
                Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:" + date);
                Intent intent = new Intent(CalendarActivity.this, MainActivity.class);
                intent.putExtra("date",date);
                startActivity(intent);

            }
        });
        */

    }
}
