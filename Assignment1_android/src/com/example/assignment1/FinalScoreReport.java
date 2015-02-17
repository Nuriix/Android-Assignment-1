package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
		t = (TextView) findViewById(R.id.studentName);
		t.setText("Student Name: " + bundle.getString("name"));
		t = (TextView) findViewById(R.id.assignment1);
		t.setText("Assignment1: " + bundle.getString("asg1") + "%");
		t = (TextView) findViewById(R.id.assignment2);
		t.setText("Assignment2: " + bundle.getString("asg2") + "%");
		t = (TextView) findViewById(R.id.assignment3);
		t.setText("Assignment3: " + bundle.getString("asg3") + "%");
		t = (TextView) findViewById(R.id.exam1);
		t.setText("Test1: " + bundle.getString("exam1") + "%");
		t = (TextView) findViewById(R.id.exam2);
		t.setText("Test2: " + bundle.getString("exam2") + "%");
		t = (TextView) findViewById(R.id.exam3);
		t.setText("Test3: " + bundle.getString("exam3") + "%");
		t = (TextView) findViewById(R.id.total);
		t.setText("Final Average: " + Integer.toString(bundle.getInt("average")) + "%");
		t = (TextView) findViewById(R.id.letter);
		t.setText("Score in letter: " + bundle.getString("scoreInLetter"));
	}
	
	public void onClick(View v){
		finish();
	}

}