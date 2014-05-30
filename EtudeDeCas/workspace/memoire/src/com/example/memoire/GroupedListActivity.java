package com.example.memoire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.memoire.GroupedListActivity;
import com.example.memoire.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class GroupedListActivity extends ActionBarActivity {
	
	// graphical components
	LinearLayout layoutId = null;
	String[] array_master = null;
	String[] array_details = null;
	ListView view = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_groupedlist);

		array_master = new String[]{"Audi A1","Audi A3","Audi A4","VW Polo","VW Golf"};
		array_details = new String[]{
				"Details of Audi A1",
				"Details of Audi A3",
				"Details of Audi A4",
				"Details of VW Polo",
				"Details of VW Golf"
		};
		layoutId = (LinearLayout)findViewById(R.id.layoutId);
			
		for(int i=0;i<array_master.length;i++){
			TextView t1 = new TextView(this);
			t1.setText(array_master[i]);
			t1.setWidth(LayoutParams.MATCH_PARENT);
			t1.setTextSize(20);
			t1.setPadding(2, 6, 2, 2);
			layoutId.addView(t1);
			View separator = new View(this);
			separator.setMinimumWidth(LayoutParams.MATCH_PARENT);
			separator.setMinimumHeight(1);
			separator.setBackgroundColor(Color.BLACK);
			layoutId.addView(separator);
			t1 = new TextView(this);
			t1.setText(array_details[i]);
			t1.setWidth(LayoutParams.MATCH_PARENT);
			t1.setPadding(2, 2, 2, 2);
			layoutId.addView(t1);
			separator = new View(this);
			separator.setMinimumWidth(LayoutParams.MATCH_PARENT);
			separator.setMinimumHeight(1);
			separator.setBackgroundColor(Color.BLACK);
			layoutId.addView(separator);
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

}