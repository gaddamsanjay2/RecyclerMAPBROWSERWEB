package com.example.recyclermapbrowserweb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterClass adapterClass;
    ModelClass modelClass;
    List<ModelClass> modelClassList = new ArrayList<>();
    TextView textViewTitle;
    ImageView call1;
    EditText Mobilenumber;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       call1=findViewById(R.id.callid);
       /* call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = Mobilenumber.getContext().toString();
                if (str1.trim().equals("10")) ;
                {
                    Toast.makeText(getApplicationContext(), "plz enter YOur name", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+str1));

                    startActivity(intent);


                    startActivity(intent);

                }




                Toast.makeText(getApplicationContext(), "Calling", Toast.LENGTH_SHORT).show();

            }
        });*/


        recyclerView = findViewById(R.id.recyclerview);

        textViewTitle = findViewById(R.id.titleid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterClass = new AdapterClass(getApplicationContext(), modelClassList);
        recyclerView.setAdapter(adapterClass);

        localdata();
    }

    private void localdata() {
        modelClass = new ModelClass(R.drawable.img,"Agra",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_1,"Hyderabad",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531" );
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_2,"Goa",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_3,"Varanasi",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890" ,27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_4,"Mysore",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_5,"Delhi",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_6,"Mumbai",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_7,"Manali",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_8,"Ladakh",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_9,"Andaman",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_10,"Udaipur",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_11,"SriNagar",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_12,"Munnar",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531" );
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_13,"Varkala",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150 ,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_14,"Alleppey",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531" );
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_15,"Rishikesh",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890" ,27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_16,"Dargeeling",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531" );
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_17,"Shimla",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_18,"Ooty",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150 ,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_19,"Jaipur",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890" ,27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_20,"Kodaikanal",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_21,"Kolkata",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150 ,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_22,"Johdpur",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_23,"Bangalore",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150 ,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_24,"Pondicherry",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531" );
        modelClassList.add(modelClass);
        modelClass=new ModelClass(R.drawable.img_25,"Haridwar",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_open_in_browser_24 ,"1234567890",27.174645, 78.042150,"https://www.bing.com/search?q=taj+mahal&cvid=ea2def2a486642ec93da39579bd46628&aqs=edge.1.69i57j46j0l7j69i11004.3029j0j1&pglt=43&FORM=ANSAB1&PC=U531");
        modelClassList.add(modelClass);
        adapterClass.notifyDataSetChanged();

    }
}