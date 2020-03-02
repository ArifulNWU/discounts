package com.arifulislam.restro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

public class AboutUs extends AppCompatActivity {

    private Button back;
    private LinearLayout location,contact,working_hours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);


        back = findViewById(R.id.backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard.class));
                finish();
            }
        });

        location = findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Location","7 Raster Mor Khulna");
            }
        });

        contact = findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Contact","1. 01300225256\n2. 01959959547");
            }
        });

        working_hours = findViewById(R.id.working_hours);
        working_hours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Working Hours","8 Hours");
            }
        });

    }

    public void showDialog(String title, String body){
        new MaterialDialog.Builder(AboutUs.this)
                .title(title)
                .cancelable(false)
                .content(body)
                .positiveText("Cancel")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
}
