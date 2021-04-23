package com.example.easybus;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page70202Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page70202);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Button ib1 = (Button)findViewById(R.id.button10);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Page70202Activity.this,Page70201tureActivity.class);
                startActivity(it1);
            }

        });
        Button ib2 = (Button)findViewById(R.id.button11);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Page70202Activity.this,Page70201falseActivity.class);
                startActivity(it1);
            }

        });
    }
}
