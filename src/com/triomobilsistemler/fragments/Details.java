package com.triomobilsistemler.fragments;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.triomobilsistemler.adapters.DetailListAdapter;
import com.triomobilsistemler.triomobil.R;

public class Details extends Fragment {

	private View view;

	private Button showInMap, blockVehicle;
	private ListView detailList;

	private static final String DATE = "Tarih";
	private static final String IGNITER = "Kontak";
	private static final String DRIVER = "Sürücü";
	private static final String MODEL = "Model";
	private static final String SPEED = "Hýz";
	private static final String DISTANCE = "Mesafe";
	private static final String ADDRESS = "Adres";

	private static final int VALUES_LENGHT = 20;

	private BaseAdapter adapter;

	private List<String> values;
	
	public static Details newInstance(){
		return new Details();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.fragment_details, container, false);

		initVies(view);

		return view;
	}

	private void initVies(View view) {

		final String[] labels = { DATE,IGNITER,
				DRIVER, MODEL, SPEED,
				DISTANCE, ADDRESS };

		values = new ArrayList<String>();

		// Try out part :::::::::::
		values.add(DATE);
		values.add(IGNITER);
		values.add(DRIVER);
		values.add(MODEL);
		values.add(SPEED);
		values.add(DISTANCE);
		values.add(ADDRESS);

		showInMap = (Button) view.findViewById(R.id.detail_show_in_the_map_btn);
		blockVehicle = (Button) view
				.findViewById(R.id.detail_block_vehicle_btn);

		detailList = (ListView) view.findViewById(R.id.detail_list);

		adapter = new DetailListAdapter(labels, values, getActivity());
		detailList.setAdapter(adapter);

	}
}
