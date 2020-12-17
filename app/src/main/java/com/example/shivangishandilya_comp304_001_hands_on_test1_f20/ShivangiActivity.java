package com.example.shivangishandilya_comp304_001_hands_on_test1_f20;

//Student number : 301119183
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ShivangiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shivangi);
        final ImageButton btn = (ImageButton) findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ShandilyaActivity.class);
                startActivity(intent);
            }
        });
    }


}