package com.example.easybus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page70103trueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page70103true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button ib1 = (Button)findViewById(R.id.button25);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Page70103trueActivity.this,Page7Activity.class);
                startActivity(it1);
            }
        });
    }
}
