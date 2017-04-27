package com.example.a15017363.p02_sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvHolidayType;
    ArrayList<String> al;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHolidayType = (ListView)findViewById(R.id.lvHolidayType);

        al = new ArrayList<String>();
        al.add("Secular");
        al.add("Ethnic & Religion");

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, al);
        lvHolidayType.setAdapter(aa);

        lvHolidayType.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedType = al.get(position);
                Intent intent = new Intent( getBaseContext(), Holidays.class);
                intent.putExtra("type",selectedType.toString());

                startActivity(intent);


            }
        });
    }
}
