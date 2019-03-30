package com.twofortyfouram.locale.example.condition.display;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import static com.twofortyfouram.locale.example.condition.display.service.BackgroundService.INTENT_REQUEST_REQUERY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        TaskerPlugin.Event.addPassThroughMessageID( INTENT_REQUEST_REQUERY );
        getApplication().sendBroadcast(INTENT_REQUEST_REQUERY);
    }
}
