package com.itheima.bluetoothlight;

import java.util.ArrayList;

import android.bluetooth.BluetoothDevice;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DeviceAdapter extends BaseAdapter {

	private ArrayList<BluetoothDevice> devices;
	
	public DeviceAdapter(ArrayList<BluetoothDevice> devices) {
		super();
		this.devices = devices;
	}

	
	@Override
	public int getCount() {
		return devices.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view ;
		if(convertView == null){
			view = View.inflate(parent.getContext(), R.layout.item_device, null);
		}else {
			view = convertView;
		}
		
		TextView tv_name = (TextView) view.findViewById(R.id.tv_name);
		TextView tv_address = (TextView) view.findViewById(R.id.tv_address);
		
		BluetoothDevice bluetoothDevice = devices.get(position);
		tv_name.setText(bluetoothDevice.getName());
		tv_address.setText(bluetoothDevice.getAddress());
		
		return view;
	}

}
