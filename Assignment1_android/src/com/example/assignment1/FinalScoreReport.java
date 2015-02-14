package com.example.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class FinalScoreReport extends Activity {
	
	TextView tv;
	TextView tv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//get Bundle object passed in
		Bundle bundle = getIntent().getExtras();
		tv = new TextView(this);
		tv = (TextView) findViewById(R.id.test);
		//tv2 = new TextView(this);

		tv.setText(bundle.getString("name"));
		setContentView(R.layout.second);
		//tv.appendText("Step Two: fry egg");
		//mHandler.postDelayed(mUpdateUITimerTask, 5 * 1000);
	}
	
	private final Runnable mUpdateUITimerTask = new Runnable() {
	    public void run() {
	        tv2.setText("Second text to display!");
	        setContentView(tv2);
	    }
	};
	private final Handler mHandler = new Handler();

}
