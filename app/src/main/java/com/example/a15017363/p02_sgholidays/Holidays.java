package com.example.a15017363.p02_sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Holidays extends AppCompatActivity {

    ListView lvHolidays;
    TextView tvHolidayType;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holidays);

        lvHolidays = (ListView) this.findViewById(R.id.lvHolidays);
        tvHolidayType = (TextView) findViewById(R.id.tvHolidayType);

        holidays = new ArrayList<Holiday>();


        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new HolidayAdaptor(this, R.layout.row, holidays);
        lvHolidays.setAdapter(aa);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvHolidayType.setText(type);

        if(type.equals("Secular")){
            holidays.add(new Holiday("New Year's Day","1 Jan 2017","newyear"));
            holidays.add(new Holiday("Labour Day","1 May 2017","labourday"));
            holidays.add(new Holiday("National Day","9 Aug 2017","nationalday"));

        }else{
            holidays.add(new Holiday("Chinese New Year","28-29 Jan 2017","cny"));
            holidays.add(new Holiday("Good Friday","14 April 2017","goodfriday"));
            holidays.add(new Holiday("Vesak Day","10 May 2017","vesakday"));
            holidays.add(new Holiday("Hari Raya Puasa","25 June 2017","harirayapuasa"));
            holidays.add(new Holiday("Hari Raya Haji","1 Sept 2017","harirayahaji"));
            holidays.add(new Holiday("Deepavali","18 Oct 2017","deepavali"));
            holidays.add(new Holiday("Christmas Day" ,"25 Dec 2017","christmas"));


        }

        lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHol = holidays.get(position);

                Toast.makeText(Holidays.this, selectedHol.getName()
                                + " Date: " + selectedHol.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
