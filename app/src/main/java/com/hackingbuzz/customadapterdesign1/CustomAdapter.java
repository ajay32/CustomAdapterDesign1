package com.hackingbuzz.customadapterdesign1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 12/11/2016.
 */

public class CustomAdapter extends BaseAdapter {

    public static final int MAX_ITEMS = 5;
    LayoutInflater myInflater;

    public CustomAdapter(LayoutInflater inflater) {

        myInflater = inflater;
    }




    @Override
    public int getCount() {     // this method is extremely important it tells the applcation how many items in the list ..by default it returns 0 ..change this number otherwise your app will show blank screen (coz no item in list )
        return MAX_ITEMS;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {    // we need position with onItemClickListenr we are not implementing that here so just skipping..
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // convertView is the single view that we have created in (view_desing) xml file . Why we want that...coz it has got an imageView and TextVew ..once we get then both by ConverView  we can assign them image and text progmatically

        if(convertView == null) {   // i know it doesnt got anything but worth checking help to stay away from crashing of app

            convertView = myInflater.inflate(R.layout.view_design, parent, false);   // it is inflating the xml file that has got text and image that we have created it will show that if you try to just run this
        }
            //    return convertView;



            // now overriding the default desgin  image and text by what we want....
         // so now our xml file is in convertView object.....so we are going to initlize image and text that is in object... so we have to give name while intilizing like  converView.findViewById

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewVD);  // id represents item in view Desing xml file where convertView get the desing

            TextView textView = (TextView) convertView.findViewById(R.id.textViewVD);

            imageView.setImageResource(R.drawable.lavery);
            textView.setText("Donna");

            return convertView;



    }
}
