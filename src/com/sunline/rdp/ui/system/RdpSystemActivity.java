package com.sunline.rdp.ui.system;

import java.util.ArrayList;
import java.util.List;

import com.sunline.rdp.R;
import com.sunline.rdp.adapter.MenuAdapter;
import com.sunline.rdp.entity.Icon;

import android.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class RdpSystemActivity extends Activity
{
	private GridView menuView;
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rdpsystem_lay);
		menuView = (GridView) findViewById(R.id.menuview);
		Intent intent = this.getIntent();
		String str = intent.getStringExtra("text");
		List<Icon> listIcons = new ArrayList<Icon>();
		Icon icon = new Icon();
		icon.setiId(R.drawable.a);
		icon.setiName("2101");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.b);
		icon.setiName("2102");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.c);
		icon.setiName("2103");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		icon = new Icon();
		icon.setiId(R.drawable.d);
		icon.setiName("2104");
		listIcons.add(icon);
		menuView.setAdapter(new MenuAdapter(listIcons, this));
	}
}
