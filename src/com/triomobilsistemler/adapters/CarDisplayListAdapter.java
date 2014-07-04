package com.triomobilsistemler.adapters;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.triomobilsistemler.triomobil.R;

public class CarDisplayListAdapter extends BaseAdapter {

	private static final String DATE = "date";
	private static final String TIME = "time";
	private static final String DESCRIPTION = "description";
	private static final String STATE = "state";
	private static final String SPEED = "speed";
	private static final String LOCATION = "location";
	private static final String PLATE = "plate";
	private static final String CURSOR = "cursor";


	private List<HashMap<String, String>> textData;
	private Context activity;
	private List<HashMap<String, Integer>> imageDate;

	private LayoutInflater inflater;
	private View itemView;

	
	
	public CarDisplayListAdapter(List<HashMap<String, String>> textData,
			Context context, List<HashMap<String, Integer>> imageDate) {
		super();
		this.textData = textData;
		this.activity= context;
		this.imageDate = imageDate;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return textData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return textData.get(position).get(null);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public static class ViewHolder {

		public TextView time;
		public TextView date;
		public TextView description;
		public TextView speed;
		public TextView state;
		public TextView location;

		public ImageView time_iw;
		public ImageView date_iw;
		public ImageView description_iw;
		public ImageView speed_iw;
		public ImageView state_iw;
		public ImageView location_iw;

		public ImageView plate_iw;
		public ImageView cursor_iw;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		itemView = convertView;
		ViewHolder holder;

		if(itemView==null){
		
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		itemView = inflater.inflate(R.layout.car_display_list_row, parent,
				false);

		holder = new ViewHolder();

		holder.date = (TextView) itemView.findViewById(R.id.lw_date_tw);
		holder.time = (TextView) itemView.findViewById(R.id.lw_time_tw);
		holder.description = (TextView) itemView
				.findViewById(R.id.lw_description_tw);
		holder.speed = (TextView) itemView.findViewById(R.id.lw_speed_tw);
		holder.state = (TextView) itemView.findViewById(R.id.lw_state_tw);
		holder.location = (TextView) itemView.findViewById(R.id.lw_location_tw);

		holder.date_iw = (ImageView) itemView.findViewById(R.id.lw_date_iw);
		holder.time_iw = (ImageView) itemView.findViewById(R.id.lw_time_iw);
		holder.description_iw = (ImageView) itemView
				.findViewById(R.id.lw_description_iw);
		holder.speed_iw = (ImageView) itemView.findViewById(R.id.lw_speed_iw);
		holder.state_iw = (ImageView) itemView.findViewById(R.id.lw_state_iw);
		holder.location_iw = (ImageView) itemView
				.findViewById(R.id.lw_location_iw);

		holder.cursor_iw = (ImageView) itemView.findViewById(R.id.lw_cursor_iw);
		holder.plate_iw = (ImageView) itemView.findViewById(R.id.lw_plate_iw);

		holder.date.setText(textData.get(position).get(DATE));
		holder.time.setText(textData.get(position).get(TIME));
		holder.description.setText(textData.get(position).get(DESCRIPTION));
		holder.speed.setText(textData.get(position).get(SPEED));
		holder.state.setText(textData.get(position).get(STATE));
		holder.location.setText(textData.get(position).get(LOCATION));
		

		holder.date_iw.setImageResource(imageDate.get(position).get(DATE));
		holder.time_iw.setImageResource(imageDate.get(position).get(TIME));
		holder.description_iw.setImageResource(imageDate.get(position).get(
				DESCRIPTION));
		holder.speed_iw.setImageResource(imageDate.get(position).get(SPEED));
		holder.state_iw.setImageResource(imageDate.get(position).get(STATE));
		holder.location_iw.setImageResource(imageDate.get(position).get(
				LOCATION));

		holder.cursor_iw.setImageResource(imageDate.get(position).get(CURSOR));
		holder.plate_iw.setImageResource(imageDate.get(position).get(PLATE));

		itemView.setTag(holder);
		}else{
			holder = (ViewHolder) itemView.getTag();
		}

		return itemView;
	}

}
