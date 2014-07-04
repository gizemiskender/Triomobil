package com.triomobilsistemler.fragments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.triomobilsistemler.adapters.CarDisplayListAdapter;
import com.triomobilsistemler.triomobil.R;

public class CurrentLoc extends Fragment {

	private View view;
	private ListView list;
	private EditText search_et;
	private Button search_btn;
	private BaseAdapter adapter;

	private static final String DATE = "date";
	private static final String TIME = "time";
	private static final String DESCRIPTION = "description";
	private static final String STATE = "state";
	private static final String SPEED = "speed";
	private static final String LOCATION = "location";
	private static final String PLATE = "plate";
	private static final String CURSOR = "cursor";
	
	public static CurrentLoc newInstance(){
		return new CurrentLoc();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater
				.inflate(R.layout.fragment_current_loc, container, false);
		initViews(view);

		return view;
	}

	private void initViews(View view) {
		
		getActivity().getActionBar().hide();
		
		String value = "asd";
		list = (ListView) view.findViewById(R.id.car_display_lw);
		search_et = (EditText) view.findViewById(R.id.plate_searh_et);
		search_btn = (Button) view.findViewById(R.id.plate_search_btn);

		List<HashMap<String, String>> textView = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> values = new HashMap<String, String>();

		values.put(DATE, value);
		values.put(TIME, value);
		values.put(STATE, value);
		values.put(LOCATION, value);
		values.put(DESCRIPTION, value);
		values.put(SPEED, value);

		textView.add(values);
		
		Log.d("Debug Concept", ""+textView.get(0).get(DATE));

		List<HashMap<String, Integer>> imageView = new ArrayList<HashMap<String, Integer>>();

		HashMap<String, Integer> images = new HashMap<String, Integer>();
		
		images.put(DATE, R.drawable.ic_launcher);
		images.put(TIME, R.drawable.ic_launcher);
		images.put(DESCRIPTION, R.drawable.ic_launcher);
		images.put(SPEED, R.drawable.ic_launcher);
		images.put(STATE, R.drawable.ic_launcher);
		images.put(LOCATION, R.drawable.ic_launcher);
		images.put(PLATE, R.drawable.ic_launcher);
		images.put(CURSOR, R.drawable.ic_launcher);
		
		imageView.add(images);
		
		adapter = new CarDisplayListAdapter(textView, getActivity(), imageView);
		
		list.setAdapter(adapter);

	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		
		super.onCreateOptionsMenu(menu, inflater);

		
	}
	
	
	
	
}