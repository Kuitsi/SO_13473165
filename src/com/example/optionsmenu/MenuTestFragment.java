package com.example.optionsmenu;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class MenuTestFragment extends SherlockFragment {

	public static MenuTestFragment newInstance() {
		MenuTestFragment fragment = new MenuTestFragment();
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		setHasOptionsMenu(true);
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		TextView text = new TextView(getSherlockActivity());
		text.setGravity(Gravity.CENTER);
		text.setText("Fragment with SubMenu");
		text.setPadding(20, 20, 20, 20);

		LinearLayout layout = new LinearLayout(getSherlockActivity());
		layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		layout.setGravity(Gravity.CENTER);
		layout.addView(text);

		return layout;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.fragment, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		String TAG = "submenu";
		switch (item.getItemId()) {
		case R.id.options:
			Log.d(TAG, "SubMenu");
			return true;
		case R.id.i1:
			Log.d(TAG, "MenuItem 1");
			return true;
		case R.id.i2:
			Log.d(TAG, "MenuItem 2");
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
