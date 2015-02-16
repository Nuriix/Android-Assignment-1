package com.example.assignment1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button compute = (Button) findViewById(R.id.compute);
		compute.setOnClickListener(new clsOnClickListener());
		Button clear = (Button) findViewById(R.id.clear);
		clear.setOnClickListener(new clsOnClickListener());
		Button finalReport = (Button) findViewById(R.id.finalReport);
		finalReport.setOnClickListener(new clsOnClickListener());
		Button sumReport = (Button) findViewById(R.id.sumReport);
		sumReport.setOnClickListener(new clsOnClickListener());
		Button exit = (Button) findViewById(R.id.exit);
		exit.setOnClickListener(new clsOnClickListener());
	}
	
	public class clsOnClickListener implements View.OnClickListener{
		
		EditText name = (EditText) findViewById(R.id.name);
		EditText asg1 = (EditText) findViewById(R.id.asg1);
		EditText asg2 = (EditText) findViewById(R.id.asg2);
		EditText asg3 = (EditText) findViewById(R.id.asg3);
		EditText exam1 = (EditText) findViewById(R.id.test1);
		EditText exam2 = (EditText) findViewById(R.id.test2);
		EditText exam3 = (EditText) findViewById(R.id.test3);
		//EditText finalScore = (EditText) findViewById(R.id.finalScore);
		
		@SuppressWarnings("deprecation")
		public void onClick(View v){
			if (v.getId()==R.id.compute){
				showDialog(0);
			}
			
			else if (v.getId()==R.id.clear){
				btnClear(name);
				btnClear(asg1);
				btnClear(asg2);
				btnClear(asg3);
				btnClear(exam1);
				btnClear(exam2);
				btnClear(exam3);
			}
			
			else if (v.getId()==R.id.finalReport){
				Intent i = new Intent("asg1.finalReport");

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
			
			else if (v.getId()==R.id.sumReport){
				Intent i = new Intent("asg1.summaryReport");
				startActivity(i);
			}
			
			else{	//exit
				finish();
				System.exit(0);
			}
		}
		
		/**
		 * Clearing text field
		 * @param text EditText object
		 */
		private void btnClear(EditText text){
			text.getText().clear();
		}
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
