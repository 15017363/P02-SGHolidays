package com.example.a15017363.p02_sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017363 on 27/4/2017.
 */

public class HolidayAdaptor extends ArrayAdapter<Holiday> {
    private Context context;
    private ArrayList<Holiday> holiday;
    private TextView tvDay;
    private TextView tvDate;
    private ImageView ivHoliday;

    public HolidayAdaptor(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holiday = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        tvDay = (TextView)rowView.findViewById(R.id.tvDay);
        // Get the ImageView object
        ivHoliday = (ImageView) rowView.findViewById(R.id.ivHoliday);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentHol = holiday.get(position);
        // Set the TextView to show the food

        tvDay.setText(currentHol.getName());
        tvDate.setText(currentHol.getDate());
        //Set the image to star or nostar accordingly
        if(currentHol.getName().equals("Chinese New Year")) {
            ivHoliday.setImageResource(R.drawable.cny);
        }else if(currentHol.getName().equals("New Year's Day")){
            ivHoliday.setImageResource(R.drawable.newyear);
        }else if(currentHol.getName().equals("Labour Day")){
            ivHoliday.setImageResource(R.drawable.labourday);
        } else {
            ivHoliday.setImageResource(R.drawable.goodfriday);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
