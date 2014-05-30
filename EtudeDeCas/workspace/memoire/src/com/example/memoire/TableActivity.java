package com.example.memoire;

import com.example.memoire.TableActivity;
import com.example.memoire.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
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
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class TableActivity extends ActionBarActivity {
	
	// graphical components
	LinearLayout layoutId = null;
	TextView[] listTextView = null;
	String[] array_master = null;
	String[] array_details = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table);

		array_master = new String[]{"Audi A1","Audi A3","Audi A4","VW Polo","VW Golf"};
		array_details = new String[]{
				"Details of Audi A1",
				"Details of Audi A3",
				"Details of Audi A4",
				"Details of VW Polo",
				"Details of VW Golf"
		};
		layoutId = (LinearLayout)findViewById(R.id.layoutId);
				
		TableLayout	table = new TableLayout(this);
		table.setMinimumHeight(LayoutParams.MATCH_PARENT);
		table.setMinimumWidth(LayoutParams.MATCH_PARENT);
		table.setBackgroundColor(Color.LTGRAY);
		
		for(int i=0;i<array_master.length;i++){
			// creation de la ligne
			TableRow row = new TableRow(this);
			row.setMinimumHeight(LayoutParams.MATCH_PARENT);
			row.setMinimumWidth(LayoutParams.MATCH_PARENT);
			
			// creation du contenu de la ligne
			TextView text = new TextView(this);
			text.setGravity(Gravity.LEFT);
			text.setPadding(2, 2, 2, 2);
			text.setText(array_master[i]);
			text.setTextSize(20);
			TableLayout.LayoutParams params = new TableLayout.LayoutParams();
			params.setMargins(1, 1, 1, 1);
			row.setLayoutParams(params);
			row.setBackgroundColor(Color.WHITE);
	        row.addView(text);
	        text = new TextView(this);
			text.setGravity(Gravity.LEFT);
			text.setPadding(2, 2, 2, 2);
			text.setText(array_details[i]);
	        row.addView(text);
			table.addView(row);
		}
		layoutId.addView(table);
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
}
