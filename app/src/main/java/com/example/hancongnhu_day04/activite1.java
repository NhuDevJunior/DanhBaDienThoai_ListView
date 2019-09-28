package com.example.hancongnhu_day04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class activite1 extends AppCompatActivity {
    TextView ten;
    TextView style;
    TextView date;
    TextView number;
    TextView number1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite1);
        ten=findViewById(R.id.dbname);
        style=findViewById(R.id.dbstyle);
        date=findViewById(R.id.dbdate);
        number=findViewById(R.id.dbstd);
        number1=findViewById(R.id.dbstd2);
        Intent intent=getIntent();
        Contact contact=(Contact) intent.getSerializableExtra("object");
        ten.setText(contact.getName());
        style.setText(contact.getStyle());
        date.setText(contact.getDate());
        number.setText(contact.getNumber());
        number1.setText(contact.getNumber());
    }

}
