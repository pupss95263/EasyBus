package com.example.easybus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page70302Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page70302);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Button ib1 = (Button)findViewById(R.id.button14);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Page70302Activity.this,Page70301trueActivity.class);
                startActivity(it1);
            }

        });
        Button ib2 = (Button)findViewById(R.id.button13);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Page70302Activity.this,Page70301falseActivity.class);
                startActivity(it1);
            }

        });
    }
}
