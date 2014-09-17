package org.alljoyn.bus.samples.simpleservice;


import android.os.Bundle;
import android.app.ActionBar;
import android.app.TabActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;

public class MainTabWidget extends TabActivity {

    private static final String TAG = "MainTabWidget";
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;

        Intent intent;
        intent = new Intent().setClass(this, Service.class);
        spec = tabHost.newTabSpec("Service").setIndicator("Service").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Client.class);
        spec = tabHost.newTabSpec("Client").setIndicator("Client").setContent(intent);
        tabHost.addTab(spec);
               
        tabHost.setCurrentTab(0);
    } 	
	
}
