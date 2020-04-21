package com.example.textinputlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtUerName = findViewById(R.id.edtUerName);
        final EditText edtAddress = findViewById(R.id.edtAddress);

        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(edtUerName.getText().toString().trim().equals("") || edtAddress.getText().toString().trim().equals("")){
                     Toast.makeText(MainActivity.this,"กรุณากรอกข้อมูลให้ครบด้วยค่ะ", Toast.LENGTH_LONG).show();
                 }else {
                     Toast.makeText(MainActivity.this,"ครบ", Toast.LENGTH_LONG).show();
                 }
            }
        });

    }
}
