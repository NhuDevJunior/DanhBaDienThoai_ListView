package com.example.hancongnhu_day04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contact;
    ListView ivContact;
    AdapterContact adapterContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivContact=findViewById(R.id.ivcontact);
        contact=new ArrayList<>();
        contact.add(new Contact("MRA","di động","1111111111","12/09/2019",false));
        contact.add(new Contact("MRB","điện thoại","2222222222","12/09/2019",true));
        contact.add(new Contact("MRC","di động","333333333","12/09/2019",true));
        /*
        contact.add(new Contact("MRE","di động","11/09/2019",false));
        contact.add(new Contact("MRD","điện thoại","11/09/2019",true));
        contact.add(new Contact("555555555","Việt Name","10/09/2019",false));
        contact.add(new Contact("MRF","điện thoại","09/09/2019",false));
        contact.add(new Contact("777777777","Việt Nam","09/09/2019",false));
        contact.add(new Contact("MRG","điện thoại","08/09/2019",false));
        contact.add(new Contact("999999999","Việt Name","08/09/2019",false));
        */

        adapterContact=new AdapterContact(contact);
        ivContact.setAdapter(adapterContact);
        ivContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, activite1.class);
                switch (i) {

                    case 0:
                    //Truyền 1 object bằng intent
                        intent.putExtra("object", contact.get(i));
                        startActivity(intent);
                    break;
                    case 1:
                        //Truyền 1 object bằng intent
                        intent.putExtra("object", contact.get(i));
                        startActivity(intent);
                        break;
                    case 2:

                        //Truyền 1 object bằng intent
                        intent.putExtra("object", contact.get(i));
                        startActivity(intent);
                        break;

                }

            }
        });






    }
}

