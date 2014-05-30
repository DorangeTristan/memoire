package com.example.memoire;

import com.example.memoire.MultipleExpansionListActivity;
import com.example.memoire.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MultipleExpansionListActivity extends ActionBarActivity {
	
	// graphical components
	LinearLayout layoutId = null;
	Button[] listButton = null;
	TextView[] listTextView = null;
	String[] array_master = null;
	String[] array_details = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multipleexpansionlist);
		
		array_master = new String[]{"Audi A1","Audi A3","Audi A4","VW Polo","VW Golf"};
		array_details = new String[]{
				"Details of Audi A1",
				"Details of Audi A3",
				"Details of Audi A4",
				"Details of VW Polo",
				"Details of VW Golf"
		};
		listButton = new Button[array_master.length];
		listTextView = new TextView[array_master.length];

		layoutId = (LinearLayout)findViewById(R.id.layoutId);
		
		for(int i=0;i<array_master.length;i++){
			Button b1 = new Button(this);
			b1.setText(array_master[i]);
			b1.setHeight(LayoutParams.WRAP_CONTENT);
			b1.setWidth(LayoutParams.MATCH_PARENT);
			b1.setOnClickListener(buttonListener);
			listButton[i] = b1;
			layoutId.addView(b1);
			
			TextView t1 = new TextView(this);
			t1.setText(array_details[i]);
			t1.setWidth(LayoutParams.MATCH_PARENT);
			t1.setVisibility(View.GONE);
			listTextView[i] = t1;
			layoutId.addView(t1);
		}					
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private OnClickListener buttonListener = new OnClickListener() {
		public void onClick(View v) {
			Button b = (Button) v;
			String text = b.getText().toString();
			for(int i=0;i<array_master.length;i++){
				if(text.equals(array_master[i])){
					if(listTextView[i].getVisibility() != View.VISIBLE){ listTextView[i].setVisibility(View.VISIBLE);}
					else{listTextView[i].setVisibility(View.GONE);}
				}
			}
		}
	};
}
