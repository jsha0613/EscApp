package com.example.escapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MylockerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylocker);

        final ImageButton addButton = (ImageButton) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() { // 물건 추가로 전환
                                              @Override
                                              public void onClick(View v) {
                                                  Intent addIntent = new Intent(MylockerActivity.this, AddActivity.class);
                                                  MylockerActivity.this.startActivity(addIntent);
                                              }
                                          }

        );
    }
}
