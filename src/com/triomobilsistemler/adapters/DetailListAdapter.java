package com.triomobilsistemler.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.triomobilsistemler.triomobil.R;

public class DetailListAdapter extends BaseAdapter {

	private String[] label;
	private List<String> values;
	private String[] columns;
	private Context context;

	private LayoutInflater inflater;
	private View itemView;

	public DetailListAdapter(String[] label, List<String> values, Context context) {
		super();
		this.label = label;
		this.values = values;
		this.context = context;

		columns = new String[values.size()];
		
		for (int i = 0; i < values.size(); i++) {
			columns[i] = ":";
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return values.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return values.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	private static class ViewHolder {
		public TextView tw_label;
		public TextView tw_column;
		public TextView tw_values;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {

		itemView = arg1;
		ViewHolder holder;

		if (itemView == null) {

			inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
			itemView = inflater.inflate(R.layout.detail_list_row, arg2, false);

			holder = new ViewHolder();

			holder.tw_label = (TextView) itemView
					.findViewById(R.id.detail_list_label);
			holder.tw_column = (TextView) itemView
					.findViewById(R.id.detail_list_column);
			holder.tw_values = (TextView) itemView
					.findViewById(R.id.detail_list_values);
			
			holder.tw_label.setText(label[arg0]);
			holder.tw_column.setText(columns[arg0]);
			holder.tw_values.setText(values.get(arg0));
			
			itemView.setTag(holder);
			

		}else{
			holder = (ViewHolder) itemView.getTag();
		}

		return itemView;
	}

}
