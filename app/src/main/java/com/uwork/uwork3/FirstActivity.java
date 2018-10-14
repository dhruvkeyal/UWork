package com.uwork.uwork3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        final ArrayList<Info> announce = new ArrayList<Info>();
        announce.add(new Info("Welcome to your new workplace","Oct 14, 9:30AM",""));
        announce.add(new Info("Meeting for all new staff","Oct 15, 9AM",""));
        announce.add(new Info("Reminder for special Halloween dinner","Oct 31, 7PM ",""));
        announce.add(new Info("Volunteer positions available","Nov 6, 8PM",""));
        announce.add(new Info("Employee Social Event","Nov 15, 2PM ",""));
        announce.add(new Info("Thanksgiving Holiday","Nov 26 and 27 ",""));


        InfoAdapter Adapter = new InfoAdapter(this,announce);

        ListView listView = (ListView) findViewById(R.id.firstActivity);

        listView.setAdapter(Adapter);

    }
}