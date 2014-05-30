package com.example.memoire;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
 
public class Tab1 extends Activity {
	
	// graphical components
	TextView textTab = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onglet1);
        
        Intent getUserInfo = getIntent();
        
        textTab = (TextView)findViewById(R.id.textTab);
        textTab.setText(getUserInfo.getStringExtra("details"));
        getIntent().removeExtra("details");
    }
}