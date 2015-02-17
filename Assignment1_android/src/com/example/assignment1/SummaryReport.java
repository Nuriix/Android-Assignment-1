package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This class will display the summary report for 
 * the whole group.
 * 
 * @author Li Zheng Hao & Julie Manirath
 *
 */
public class SummaryReport extends Activity {

	TextView t;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.summary);
		
		//get Bundle object passed in
		Bundle bundle = getIntent().getExtras();
		t = new TextView(this);
		//set textviews
		t = (TextView) findViewById(R.id.totalNumStudent);
		t.setText("Total student number is: " + bundle.getInt("totalNumStudent"));
		t = (TextView) findViewById(R.id.numOfPass);
		t.setText("Number of passing student: " + bundle.getInt("numOfPass"));
		t = (TextView) findViewById(R.id.groupAverage);
		t.setText("Group average score: " + bundle.getInt("groupAverage") + "%");
		t = (TextView) findViewById(R.id.bestStudent);
		t.setText("Top two best student are: " + "\n" + bundle.getString("bestStudent"));
	}
	
	/**
	 * Back to main activity
	 * @param v 
	 */
	public void onClick(View v){
		startActivity(new Intent(this, MainActivity.class).setFlags(
					Intent.FLAG_ACTIVITY_NEW_TASK | 
					Intent.FLAG_ACTIVITY_CLEAR_TASK)
	);}
	
}
