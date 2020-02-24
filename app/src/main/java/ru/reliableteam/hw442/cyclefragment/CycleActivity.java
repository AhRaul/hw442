package ru.reliableteam.hw442.cyclefragment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import ru.reliableteam.hw442.R;

public class CycleActivity extends AppCompatActivity {

    final String LOG_TAG = "[CycleActivity]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);
        makeMessage("onCreate()");
    }

    protected void onStart() {
        super.onStart();
        makeMessage("onStart()");
    }

    protected void onResume() {
        super.onResume();
        makeMessage("onResume()");
    }

    protected void onPause() {
        super.onPause();
        makeMessage("onPause()");
    }

    protected void onStop() {
        super.onStop();
        makeMessage("onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        makeMessage("onDestroy()");
    }

    private void makeMessage(String message){
//        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.i(LOG_TAG, message);
    }
}
