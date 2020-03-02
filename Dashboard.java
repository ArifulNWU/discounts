package com.arifulislam.restro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {

    private LinearLayout menu,about_us,services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        menu = findViewById(R.id.menulayout);
        about_us = findViewById(R.id.aboutuslayout);
        services = findViewById(R.id.servicelayout);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this,MenuCategory.class));
                finish();
            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this,AboutUs.class));
                finish();
            }
        });

        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this,Discounts.class));
                finish();
            }
        });
    }
}
