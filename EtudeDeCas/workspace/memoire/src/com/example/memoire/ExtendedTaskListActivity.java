package com.example.memoire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.memoire.ExtendedTaskListActivity;
import com.example.memoire.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.Html;
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

public class ExtendedTaskListActivity extends ActionBarActivity {
	
	// graphical components
	LinearLayout layoutId = null;
	String[] array_master = null;
	String[] array_details = null;
	ListView view = null;
	TextView textdetails = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_extendedtasklist);

		array_master = new String[]{"Audi A1","Audi A3","Audi A4","VW Polo","VW Golf"};
		array_details = new String[]{
				"Details of Audi A1",
				"Details of Audi A3",
				"Details of Audi A4",
				"Details of VW Polo",
				"Details of VW Golf"
		};
		layoutId = (LinearLayout)findViewById(R.id.layoutId);
		view = (ListView) findViewById(R.id.listView1);
		view.setDivider(null);
		view.setDividerHeight(0);
		textdetails = (TextView)findViewById(R.id.textdetails);
		
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
	    
	    HashMap<String, String> item;
	    for(int i = 0 ; i < array_master.length ; i++) {
	    	item = new HashMap<String, String>();
	    	item.put("masterItem", array_master[i]);
	    	list.add(item);
	    }
	    
	    ListAdapter adapter = new SimpleAdapter(this,
		      list, 
		      android.R.layout.simple_list_item_1,
		      new String[] {"masterItem"}, 
		      new int[] {android.R.id.text1});

	    view.setAdapter(adapter);
	    view.setOnItemClickListener(listviewListener);
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
	private OnItemClickListener listviewListener = new OnItemClickListener() {
		public void onClick(View v) {
			
		}

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			textdetails.setText(array_details[position]);
		}
	};
}
