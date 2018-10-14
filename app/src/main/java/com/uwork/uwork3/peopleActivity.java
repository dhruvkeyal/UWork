package com.uwork.uwork3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class peopleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        final ArrayList<People> people = new ArrayList<People>();
        people.add(new People(R.drawable.ic_people,"Dylan","Kitchen Assistant"));
        people.add(new People(R.drawable.ic_people,"Courtney","Dishwasher"));
        people.add(new People(R.drawable.ic_people,"Andrew","Ice Cream Bar"));
        people.add(new People(R.drawable.ic_people,"Kyle","Noodle Bowl"));
        people.add(new People(R.drawable.ic_people,"Helena","Main Station"));
        people.add(new People(R.drawable.ic_people,"Peter","Stir Fry"));
        people.add(new People(R.drawable.ic_people,"Jaime","Halal"));

        PeopleAdapter Adapter = new PeopleAdapter(this,people);

        ListView listView =  (ListView) findViewById(R.id.peopleActivity);

        listView.setAdapter(Adapter);
    }
}
