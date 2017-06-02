package com.example.ruchitiwari.googleanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.analytics.HitBuilders;

public class MainActivity extends AppCompatActivity
{

	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button)findViewById(R.id.btn);

		btn.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(final View view)
			{
				// Log setting open event with category="ui", action="open", and label="settings"
				MyApp.tracker().send(new HitBuilders.EventBuilder("ui", "open")
						                     .setLabel("settings")
						                     .build());
				Intent i = new Intent(MainActivity.this, SecondClass.class);
				startActivity(i);
			}
		});

	}
}
