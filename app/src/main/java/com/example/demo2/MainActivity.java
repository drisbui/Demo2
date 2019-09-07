package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtTen,txtNam;
    Button btnXuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTen=(EditText)findViewById(R.id.txtHoTen);
        txtNam=(EditText)findViewById(R.id.txtNam);
        btnXuat=(Button)findViewById(R.id.btnXuat);

        btnXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                intent.putExtra("ht",txtTen.getText().toString());
                intent.putExtra("ns",txtNam.getText().toString());
                startActivity(intent);

            }
        });

    }
}
