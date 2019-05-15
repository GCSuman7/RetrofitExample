package com.example.retrofitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
    Button btnShowEmp, btnRegisterEmp, btnSearchEmp, btnUpdateDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnShowEmp = findViewById(R.id.btnShowEmp);
        btnRegisterEmp = findViewById(R.id.btnRegisterEmp);
        btnSearchEmp = findViewById(R.id.btnSearchEmp);
        btnUpdateDelete = findViewById(R.id.btnUpdateDelete);


        btnShowEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnSearchEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, SearchEmployeeActivity.class);
                startActivity(i);
            }
        });

        btnRegisterEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashboardActivity.this, RegistrationActivity.class);
                startActivity(i);
            }
        });
    }
}
