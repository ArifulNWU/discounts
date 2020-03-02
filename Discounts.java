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

public class Discounts extends AppCompatActivity {

    private Button back;
    private LinearLayout event,discount,table_booking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discounts);


        back = findViewById(R.id.backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dashboard.class));
                finish();
            }
        });

        event = findViewById(R.id.event);
        discount = findViewById(R.id.discount_offer);
        table_booking = findViewById(R.id.table_booking);

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Event Management","1. abc\n2. def\n3. mgd");
            }
        });

        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Discount","1. abc\n2. def\n3. mgd");
            }
        });

        table_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Table Booking","1. abc\n2. def\n3. mgd");
            }
        });
    }

    public void showDialog(String title, String body){
        new MaterialDialog.Builder(Discounts.this)
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
