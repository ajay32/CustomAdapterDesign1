package com.hackingbuzz.customadapterdesign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(new CustomAdapter(getLayoutInflater()));      // CustomerAdapter class need Layout Inflater so that it can get (view_desgin) xml layout file (its compontents to work on so i am seding that from here coz AppCompatActivity has got it
    }
}


// see one this everything is an object..so here we had ArrayAdapter before it was the object of ArrayAdapter class...now we are creating
//our own adapter (CustomAdapter) so we have to create a class for it....
// see previous what ArrayAdapter has got is  layoutfile (for design) and arraylist
// we gotta do the same with our adapter 1st we need a layoutfile attach it using layoutInflater