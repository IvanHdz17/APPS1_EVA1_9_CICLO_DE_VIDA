package com.example.eva1_9_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
                                  //Superclase
public class MainActivity extends AppCompatActivity {

    //FOREGORUND - FOCO - SON VISIBLES//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }

    //BACKGROUND - LOST FOCUS - NO VISIBLES/PARCIALMENTE VISIBLES
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }

    //TRANSICION
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
    }
}