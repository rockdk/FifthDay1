package com.champ.web.fifthday1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(
                getApplicationContext(),
                "onCreate",Toast.LENGTH_LONG
        ).show();
        Log.i("Resume","onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(
                getApplicationContext(),
                "onDestroy",Toast.LENGTH_LONG
        ).show();
        Log.i("Resume","onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(
                getApplicationContext(),
                "onStart",Toast.LENGTH_LONG
        ).show();
        Log.i("Resume","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(
                getApplicationContext(),
                "onPause",Toast.LENGTH_LONG
        ).show();
        Log.i("Resume","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(
                getApplicationContext(),
                "onStop",Toast.LENGTH_LONG
        ).show();
        Log.i("Resume","onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(
                getApplicationContext(),
                "onResume",Toast.LENGTH_LONG
        ).show();
        Log.i("Resume","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(
                getApplicationContext(),
                "onRestart",Toast.LENGTH_LONG
        ).show();
        Log.i("Resume","onRestart");
    }
}
