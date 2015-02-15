package com.example.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class FinalScoreReport extends Activity {
	
	TextView t;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		//get Bundle object passed in
		Bundle bundle = getIntent().getExtras();
		t = new TextView(this);
		//set textviews
		t = (TextView) findViewById(R.id.name);
		t.setText(bundle.getString("name"));
		t = (TextView) findViewById(R.id.assignment1);
		t.setText(bundle.getString("asg1"));
		t = (TextView) findViewById(R.id.assignment2);
		t.setText(bundle.getString("asg2"));
		t = (TextView) findViewById(R.id.assignment3);
		t.setText(bundle.getString("asg3"));
		t = (TextView) findViewById(R.id.exam1);
		t.setText(bundle.getString("exam1"));
		t = (TextView) findViewById(R.id.exam2);
		t.setText(bundle.getString("exam2"));
		t = (TextView) findViewById(R.id.exam3);
		t.setText(bundle.getString("exam3"));
		t = (TextView) findViewById(R.id.total);
		t.setText(bundle.getString("final"));
		//mHandler.postDelayed(mUpdateUITimerTask, 5 * 1000);
	}
	
	private final Runnable mUpdateUITimerTask = new Runnable() {
	    public void run() {
	        t.setText("");
	        setContentView(t);
	    }
	};
	private final Handler mHandler = new Handler();

}
