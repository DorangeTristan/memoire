package com.example.memoire;

import com.example.memoire.TabbedListActivity;
import com.example.memoire.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.TabActivity;
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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabbedListActivity extends TabActivity {
	
	// graphical components
	String[] array_master = null;
	String[] array_details = null;
	TextView textTabDetails = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabbedlist);

		array_master = new String[]{"Audi A1","Audi A3","Audi A4","VW Polo","VW Golf"};
		array_details = new String[]{
				"Details of Audi A1",
				"Details of Audi A3",
				"Details of Audi A4",
				"Details of VW Polo",
				"Details of VW Golf"
		};
		
		textTabDetails =(TextView)findViewById(R.id.textTabDetails);
		
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent = null;

        for(int i=0; i<array_master.length;i++){
        	intent = new Intent();
        	intent.setClass(this, Tab1.class);
        	intent.putExtra("details",array_details[i]);
        	
        	//textTabDetails.setText(array_details[i]);
        	
        	spec = tabHost
                    .newTabSpec("Widget")
                    .setIndicator(array_master[i])
                    .setContent(intent);
            tabHost.addTab(spec);
        }
        
 
        /*intent = new Intent().setClass(this, Tab2.class);
        spec = tabHost
                .newTabSpec("Form")
                .setIndicator("Audi A3")
                .setContent(intent);
        tabHost.addTab(spec);
 
        intent = new Intent().setClass(this, Tab3.class);
        spec = tabHost
                .newTabSpec("onglet3")
                .setIndicator("Audi A4")
                .setContent(intent);
        tabHost.addTab(spec);
        */
 
        tabHost.setCurrentTab(0);
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
