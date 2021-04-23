package com.example.easybus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page70203Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page70203);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button ib1 = (Button)findViewById(R.id.button27);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Page70203Activity.this,Page70203trueActivity.class);
                startActivity(it1);
            }

        });
        Button ib2 = (Button)findViewById(R.id.button28);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Page70203Activity.this,Page70203falseActivity.class);
                startActivity(it1);
            }

        });
    }
}
