package comandydevo.wixsite.seemantshekhar43.indianstates;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating an array

        String[] arrayState = {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","National Capital Territory Of Delhi","Orissa","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangan","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};

        String[] arrayCapital = {"Hyderabad","Itanagar","Dispur","Patna","Naya Raipur","Panaji","Ghandinagar","Chandigarh","Shimla","Srinagar(summer); Jammu(Winter)","Ranchi","Bangalore","Thiruvananthapuram","Bhopal","Mumbai", "Imphal","Shillong","Aizawl","Kohima","New Delhi","Bhubaneshwar","Chandigarh","Jaipur","Gangtok","Chennai","Hyderabad","Agartala","Dehradun","Lucknow","Kolkata"};

        final ArrayList arrayList = new ArrayList (Arrays.asList(arrayCapital));
        final ArrayList arrayList1 = new ArrayList (Arrays.asList(arrayState));
        // calling the list view

        ListView listView =(ListView)findViewById(R.id.ListView);

        // convert array list to listview

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView.setAdapter(arrayAdapter);

        // making the list items to listen on tap

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "The capital of " + arrayList1.get(position) + " is " + arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
