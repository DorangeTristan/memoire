package com.example.memoire;

import com.example.memoire.MainActivity;
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
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	// graphical components
	RadioGroup group1 = null;
		RadioButton combined = null;
		RadioButton separated = null;
	TextView textCombined = null;
	RadioGroup groupCombined = null;
		RadioButton onebyone = null;
		RadioButton manyatone = null;
		RadioButton allatonce = null;
	TextView textOneByOne= null;
	RadioGroup groupOneByOne = null;
		RadioButton extendedtasklist = null;
		RadioButton reducedtasklist = null;
		RadioButton tabbedlist = null;
		RadioButton singleexpansionlist = null;
	TextView textManyAtOne = null;
	TextView textAllAtOnce = null;
	RadioGroup groupAllAtOnce = null;
		RadioButton separatedlist = null;
		RadioButton groupedlist = null;
		RadioButton bulletedlist = null;
		RadioButton orderedlist = null;
		RadioButton spacedlist = null;
		RadioButton table = null;
	Button buttonView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		group1 = (RadioGroup)findViewById(R.id.group1);
		combined = (RadioButton)findViewById(R.id.combined);
		combined.setOnClickListener(combinedListener);
		separated = (RadioButton)findViewById(R.id.separated);
		separated.setOnClickListener(separatedListener);
		// Display when radioButton Combined is chosen.
		textCombined = (TextView)findViewById(R.id.textCombined);
		textCombined.setVisibility(View.GONE);
		groupCombined = (RadioGroup)findViewById(R.id.groupCombined);
		groupCombined.setVisibility(View.GONE);
		onebyone = (RadioButton)findViewById(R.id.onebyone);
		onebyone.setOnClickListener(onebyoneListener);
		manyatone = (RadioButton)findViewById(R.id.manyatone);
		manyatone.setOnClickListener(manyatoneListener);
		allatonce = (RadioButton)findViewById(R.id.allatonce);
		allatonce.setOnClickListener(allatonceListener);

		// Display when radioButton One by One is chosen.
		textOneByOne = (TextView)findViewById(R.id.textOneByOne);
		textOneByOne.setVisibility(View.GONE);
		groupOneByOne = (RadioGroup)findViewById(R.id.groupOneByOne);
		groupOneByOne.setVisibility(View.GONE);
		extendedtasklist = (RadioButton)findViewById(R.id.extendedtasklist);
		reducedtasklist = (RadioButton)findViewById(R.id.reducedtasklist);
		tabbedlist = (RadioButton)findViewById(R.id.tabbedlist);
		singleexpansionlist = (RadioButton)findViewById(R.id.singleexpansionlist);
		
		// Display when radioButton Many at one is chosen.
		textManyAtOne = (TextView)findViewById(R.id.textManyAtOne);
		textManyAtOne.setVisibility(View.GONE);
		
		// Display when radioButton All at once is chosen.
		textAllAtOnce = (TextView)findViewById(R.id.textAllAtOnce);
		textAllAtOnce.setVisibility(View.GONE);
		groupAllAtOnce = (RadioGroup)findViewById(R.id.groupAllAtOnce);
		groupAllAtOnce.setVisibility(View.GONE);
		separatedlist = (RadioButton)findViewById(R.id.separatedlist);
		groupedlist = (RadioButton)findViewById(R.id.groupedlist);
		bulletedlist = (RadioButton)findViewById(R.id.bulletedlist);
		orderedlist = (RadioButton)findViewById(R.id.orderedlist);
		spacedlist = (RadioButton)findViewById(R.id.spacedlist);
		table = (RadioButton)findViewById(R.id.table);
		
		// Button View
		buttonView = (Button)findViewById(R.id.buttonView);
		buttonView.setOnClickListener(buttonViewListener);
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

	
	private OnClickListener combinedListener = new OnClickListener() {
		public void onClick(View v) {
			textCombined.setVisibility(View.VISIBLE);
			groupCombined.setVisibility(View.VISIBLE);
		}
	};
	private OnClickListener separatedListener = new OnClickListener() {
		public void onClick(View v) {
			// Not Visible
				// Combined 
			textCombined.setVisibility(View.GONE);
			groupCombined.setVisibility(View.GONE);
			onebyone.setChecked(false);
			manyatone.setChecked(false);
			allatonce.setChecked(false);
				// OneByOne
			textOneByOne.setVisibility(View.GONE);
			groupOneByOne.setVisibility(View.GONE);
			extendedtasklist.setChecked(false);
			reducedtasklist.setChecked(false);
			tabbedlist.setChecked(false);
			singleexpansionlist.setChecked(false);
				// ManyAtOne
			textManyAtOne.setVisibility(View.GONE);
				// AllAtOnce
			textAllAtOnce.setVisibility(View.GONE);
			groupAllAtOnce.setVisibility(View.GONE);
			separatedlist.setChecked(false);
			groupedlist.setChecked(false);
			bulletedlist.setChecked(false);
			orderedlist.setChecked(false);
			spacedlist.setChecked(false);
			table.setChecked(false);
		}
	};
	private OnClickListener onebyoneListener = new OnClickListener() {
		public void onClick(View v) {
			// Visible
			textOneByOne.setVisibility(View.VISIBLE);
			groupOneByOne.setVisibility(View.VISIBLE);
			
			// Not visible
			textManyAtOne.setVisibility(View.GONE);
			textAllAtOnce.setVisibility(View.GONE);
			groupAllAtOnce.setVisibility(View.GONE);
			separatedlist.setChecked(false);
			groupedlist.setChecked(false);
			bulletedlist.setChecked(false);
			orderedlist.setChecked(false);
			spacedlist.setChecked(false);
			table.setChecked(false);
		}
	};
	private OnClickListener manyatoneListener = new OnClickListener() {
		public void onClick(View v) {
			// Visible
			textManyAtOne.setVisibility(View.VISIBLE);
			
			// Not visible
			textOneByOne.setVisibility(View.GONE);
			groupOneByOne.setVisibility(View.GONE);
			extendedtasklist.setChecked(false);
			reducedtasklist.setChecked(false);
			tabbedlist.setChecked(false);
			singleexpansionlist.setChecked(false);
			textAllAtOnce.setVisibility(View.GONE);
			groupAllAtOnce.setVisibility(View.GONE);
			separatedlist.setChecked(false);
			groupedlist.setChecked(false);
			bulletedlist.setChecked(false);
			orderedlist.setChecked(false);
			spacedlist.setChecked(false);
			table.setChecked(false);
		}
	};
	private OnClickListener allatonceListener = new OnClickListener() {
		public void onClick(View v) {
			// Visible
			textAllAtOnce.setVisibility(View.VISIBLE);
			groupAllAtOnce.setVisibility(View.VISIBLE);
			
			// Not visible
			textOneByOne.setVisibility(View.GONE);
			groupOneByOne.setVisibility(View.GONE);
			extendedtasklist.setChecked(false);
			reducedtasklist.setChecked(false);
			tabbedlist.setChecked(false);
			singleexpansionlist.setChecked(false);
			textManyAtOne.setVisibility(View.GONE);
		}
	};
	private OnClickListener buttonViewListener = new OnClickListener() {
		public void onClick(View v) {
			Intent intent = null;
			if(reducedtasklist.isChecked()){
				intent = new Intent(MainActivity.this,ComboboxActivity.class);
			}else if(singleexpansionlist.isChecked()){
				intent = new Intent(MainActivity.this,SingleExpansionListActivity.class);
			}else if(manyatone.isChecked()){
				intent = new Intent(MainActivity.this,MultipleExpansionListActivity.class);
			}else if(tabbedlist.isChecked()){
				intent = new Intent(MainActivity.this,TabbedListActivity.class);
			}else if(bulletedlist.isChecked()){
				intent = new Intent(MainActivity.this,BulletedListActivity.class);
			}else if(orderedlist.isChecked()){
				intent = new Intent(MainActivity.this,OrderedListActivity.class);
			}else if(spacedlist.isChecked()){
				intent = new Intent(MainActivity.this,SpacedListActivity.class);
			}else if(separatedlist.isChecked()){
				intent = new Intent(MainActivity.this,SeparatedListActivity.class);
			}else if(table.isChecked()){
				intent = new Intent(MainActivity.this,TableActivity.class);
			}else if(extendedtasklist.isChecked()){
				intent = new Intent(MainActivity.this,ExtendedTaskListActivity.class);
			}else if(groupedlist.isChecked()){
				intent = new Intent(MainActivity.this,GroupedListActivity.class);
			}else if(separated.isChecked()){
				intent = new Intent(MainActivity.this,PopUpActivity.class);
			}else{
				intent = new Intent(MainActivity.this,ErrorActivity.class);
			}
			startActivity(intent);
		}
	};
}
