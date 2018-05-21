package com.example.diegocasas.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button buttonBluetooth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonBluetooth = (Button) findViewById(R.id.button_viaBluetooth);
        buttonBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityBluetooht();
            }
        });
    }

    public void openActivityBluetooht() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void viaWifi(View view) {

        Intent intent = new Intent(this, WifiActivity.class);
        startActivity(intent);
    }

}