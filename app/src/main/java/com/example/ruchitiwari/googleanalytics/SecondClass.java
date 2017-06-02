package com.example.ruchitiwari.googleanalytics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.analytics.HitBuilders;

/**
 * Created by RuchiTiwari on 4/24/2017.
 */

public class SecondClass extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Log setting open event with category="ui", action="open", and label="settings"
		MyApp.tracker().send(new HitBuilders.EventBuilder("ui", "open")
				                     .setLabel("settings")
				                     .build());
	}

}
