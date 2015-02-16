package com.example.assignment1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button exit = (Button) findViewById(R.id.exit);
		exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				System.exit(0);
			}
		});
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
	
	/**
	 * Compute button
	 * @param v View object
	 */
	public void compute(View v){
		showDialog(0);
	}
	
	@Override
	protected Dialog onCreateDialog(int id){
		switch(id){
		case 0:
			Builder alert = new AlertDialog.Builder(this);
			alert.setTitle("Please enter a valide score");
			alert.setPositiveButton("OK", null);
			return alert.create();
		}
		return null;
	}

}
