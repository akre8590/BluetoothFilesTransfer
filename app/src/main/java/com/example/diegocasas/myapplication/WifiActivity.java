package com.example.diegocasas.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WifiActivity extends AppCompatActivity {
    private Button buttonWifi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        buttonWifi = (Button)findViewById(R.id.scanWifi);
        buttonWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWifiSettings();
            }
        });
    }
    public void openWifiSettings() {
        WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifi.setWifiEnabled(true);
        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
        /*Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(intent);*/
    }
    public void enviarWIFI(View view){
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (networkInfo.isConnected()){
            Toast.makeText(this, "Listo para enviar via WI-FI", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this,"Por favor conectate a una red WI-FI", Toast.LENGTH_SHORT).show();
        }
    }
}
