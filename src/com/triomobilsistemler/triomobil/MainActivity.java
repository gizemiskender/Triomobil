package com.triomobilsistemler.triomobil;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.triomobilsistemler.fragments.CurrentLoc;
import com.triomobilsistemler.fragments.Details;
import com.triomobilsistemler.fragments.Map;
import com.triomobilsistemler.helpers.FragmentHelper;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{
	
	private Button lastLoc,map,details;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initViews();
		
		
	}
	
	private void initViews(){
		
		FragmentHelper.fragmentManager = getSupportFragmentManager();
		FragmentHelper.fragment = CurrentLoc.newInstance();
		FragmentHelper.replaceFragmentsNoBackStack(R.id.frame_container_for_fragments,
				FragmentHelper.fragment);
		
		lastLoc = (Button) findViewById(R.id.btn_current_locations_tab);
		map = (Button) findViewById(R.id.btn_map_tab);
		details = (Button) findViewById(R.id.btn_details_tab);
		
		lastLoc.setOnClickListener(this);
		map.setOnClickListener(this);
		details.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		
		switch(arg0.getId()){
		
			case R.id.btn_current_locations_tab: 
				FragmentHelper.fragmentManager = getSupportFragmentManager();
				FragmentHelper.fragment = CurrentLoc.newInstance();
				FragmentHelper.replaceFragmentsNoBackStack(R.id.frame_container_for_fragments,
						FragmentHelper.fragment);
				map.setText("Harita");
				break;
			
			case R.id.btn_map_tab:
				map.setText("Clicked");
				FragmentHelper.fragmentManager = getSupportFragmentManager();
				FragmentHelper.fragment = Map.newInstance();
				FragmentHelper.replaceFragmentsNoBackStack(R.id.frame_container_for_fragments,
						FragmentHelper.fragment);
				break;
				
			case R.id.btn_details_tab:
				FragmentHelper.fragmentManager = getSupportFragmentManager();
				FragmentHelper.fragment = Details.newInstance();
				FragmentHelper.replaceFragmentsNoBackStack(R.id.frame_container_for_fragments,
						FragmentHelper.fragment);
			
				map.setText("Harita");
		
		}
		
	}
	
}
