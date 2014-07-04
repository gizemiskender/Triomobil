package com.triomobilsistemler.fragments;

import com.triomobilsistemler.triomobil.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Map extends Fragment{

	private View view;
	
	public static Map newInstance(){
		return new Map();
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.fragment_map, container, false);
		
		return view;
	}
	
	

}
