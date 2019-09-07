package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class Main3Activity extends AppCompatActivity {

    TextView tvkq;
    Button btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvkq=(TextView)findViewById(R.id.tvKetQua);
        String hoten=getIntent().getExtras().getString("ht");
        String nam=getIntent().getExtras().getString("ns");
        String st="";
        st+="Ho ten: "+hoten+"\n";
        st+="Nam sinh: "+nam+"\n";
        Calendar calendar=Calendar.getInstance();
        st+="Tuoi: "+((calendar.getTime().getYear()+1900)- Integer.parseInt(nam.toString()));
        tvkq.setText(st);
        btnthoat=(Button)findViewById(R.id.btnThoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
