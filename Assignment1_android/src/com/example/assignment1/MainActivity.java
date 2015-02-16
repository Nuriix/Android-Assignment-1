package com.example.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * Final Score Report Button
	 * @param v View object
	 */
	public void finalClick(View v){

		Intent i = new Intent(this, FinalScoreReport.class);

		EditText name = (EditText) findViewById(R.id.name);
		EditText asg1 = (EditText) findViewById(R.id.asg1);
		EditText asg2 = (EditText) findViewById(R.id.asg2);
		EditText asg3 = (EditText) findViewById(R.id.asg3);
		EditText exam1 = (EditText) findViewById(R.id.test1);
		EditText exam2 = (EditText) findViewById(R.id.test2);
		EditText exam3 = (EditText) findViewById(R.id.test3);
		//EditText finalScore = (EditText) findViewById(R.id.finalScore);

		Bundle bundle = new Bundle();
		bundle.putString("name", name.getText().toString());
		bundle.putString("asg1", asg1.getText().toString());
		bundle.putString("asg2", asg2.getText().toString());
		bundle.putString("asg3", asg3.getText().toString());
		bundle.putString("exam1", exam1.getText().toString());
		bundle.putString("exam2", exam2.getText().toString());
		bundle.putString("exam3", exam3.getText().toString());
		//bundle.putString("final", finalScore.getText().toString());

		//attach bundle to intent object
		i.putExtras(bundle);

		startActivity(i);
	}

	/**
	 * Summary Report Button
	 * @param v View object
	 */
	public void summaryReport(View v){
		Intent i = new Intent(this, SummaryReport.class);
		startActivity(i);
	}

}
