package com.example.memoire;

import com.example.memoire.ComboboxActivity;
import com.example.memoire.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class ComboboxActivity extends ActionBarActivity {
	
	// graphical components
	Spinner combobox = null;
	TextView detailsCar = null;
	String[] array_master = null;
	String[] array_details = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_combobox);

		combobox = (Spinner)findViewById(R.id.combobox);
		array_master = new String[]{"Audi A1","Audi A3","Audi A4","VW Polo","VW Golf"};
		array_details = new String[]{
				"Details of Audi A1",
				"Details of Audi A3",
				"Details of Audi A4",
				"Details of VW Polo",
				"Details of VW Golf"
		};
				
		ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, array_master);
		combobox.setAdapter(adapter);
		combobox.setOnItemSelectedListener(comboboxListener);
		
		detailsCar = (TextView)findViewById(R.id.detailsCar);
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
	private OnItemSelectedListener comboboxListener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {
			String detailsOfCar = array_details[(int) combobox.getSelectedItemId()];
			detailsCar.setText(detailsOfCar);
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
		
	};
}
