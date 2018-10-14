package com.uwork.uwork3;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView schedule = (TextView) findViewById(R.id.shift_cover);
        schedule.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Schedule.class);
                startActivity(i);
            }
        });

        TextView first = (TextView)findViewById(R.id.announcements);

        first.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent ff = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(ff);
            }
        });

        TextView second = (TextView)findViewById(R.id.people);

        second.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent ff = new Intent(MainActivity.this,peopleActivity.class);
                startActivity(ff);
            }
        });

        TextView third = (TextView)findViewById(R.id.cover_up);

        third.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent ff = new Intent(MainActivity.this,Cover_Up.class);
                startActivity(ff);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:


                            case R.id.action_schedules:

                                View bottomFirst = (View)findViewById(R.id.action_schedules);

                                bottomFirst.setOnClickListener(new  View.OnClickListener(){
                                    @Override
                                    public void onClick(View view) {
                                        Intent ff = new Intent(MainActivity.this,Schedule.class);
                                        startActivity(ff);
                                    }
                                });

                            case R.id.action_cover_up:

                                View bottomSecond = (View)findViewById(R.id.action_cover_up);

                                bottomSecond.setOnClickListener(new  View.OnClickListener(){
                                    @Override
                                    public void onClick(View view) {
                                        Intent ff = new Intent(MainActivity.this,Cover_Up.class);
                                        startActivity(ff);
                                    }
                                });

                                case R.id.action_people:

                                    View bottomThird = (View)findViewById(R.id.action_people);

                                    bottomThird.setOnClickListener(new  View.OnClickListener(){
                                        @Override
                                        public void onClick(View view) {
                                            Intent ff = new Intent(MainActivity.this,peopleActivity.class);
                                            startActivity(ff);
                                        }
                                    });

                        }
                        return true;
                    }
                });


    }
}
