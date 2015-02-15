package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SummaryReport extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.summary);
	}
	
	public void onClick(View v){
		startActivity(new Intent(this, MainActivity.class));
	}
	
}
