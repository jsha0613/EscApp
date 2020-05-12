package com.example.escapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button mylockerButton = (Button) findViewById(R.id.mylockerButton); //내 사물함
        final Button newlockerButton = (Button) findViewById(R.id.newlockerButton); //신규사물함
        final Button nfcButton = (Button) findViewById(R.id.nfcButton); //nfc
        final Button lockerstatusButton = (Button) findViewById(R.id.lockerstatusButton); //사물함현황

        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice); //해당 프레그먼트 눌렀을때 화면이 바뀌는 레이아웃

//        TextView mylockerButton = (TextView) findViewById(R.id.mylockerButton);
        mylockerButton.setOnClickListener(new View.OnClickListener() { // 내 사물함으로 전환
                                              @Override
                                              public void onClick(View v) {
                                                  Intent mylockerIntent = new Intent(MainActivity.this, MylockerActivity.class);
                                                  MainActivity.this.startActivity(mylockerIntent);
                                              }
                                          }

        );

        lockerstatusButton.setOnClickListener(new View.OnClickListener() { // 사물함 현황으로 전환
                                              @Override
                                              public void onClick(View v) {
                                                  Intent lockerIntent = new Intent(MainActivity.this, LockerActivity.class);
                                                  MainActivity.this.startActivity(lockerIntent);
                                              }
                                          }

        );

        newlockerButton.setOnClickListener(new View.OnClickListener() { // 사물함 선택으로 전환
                                                  @Override
                                                  public void onClick(View v) {
                                                      Intent newlockerIntent = new Intent(MainActivity.this, NewlockerActivity.class);
                                                      MainActivity.this.startActivity(newlockerIntent);
                                                  }
                                              }

        );


    }
}
