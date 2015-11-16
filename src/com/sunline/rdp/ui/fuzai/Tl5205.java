package com.sunline.rdp.ui.fuzai;

import com.sunline.rdp.R;
import com.sunline.rdp.util.DensityUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Tl5205 extends Activity
{
	LinearLayout oneLay;
	EditText viewtwe,viewthree,viewfour;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tl5206_lay);
		int w = this.getResources().getDisplayMetrics().widthPixels;
		oneLay = (LinearLayout) findViewById(R.id.one_lay);
		EditText viewOne = (EditText) oneLay.getChildAt(1);
		int size = DensityUtil.dip2px(this, 300);
		viewOne.setWidth((w - size)/3);
		viewtwe = (EditText) findViewById(R.id.oldpassword);
		viewthree = (EditText) findViewById(R.id.newpassword);
		viewfour = (EditText) findViewById(R.id.insertpassword);
		
		LinearLayout partwe = (LinearLayout) viewtwe.getParent();
		int widthtwe = partwe.getWidth();
		viewtwe.setWidth(50);
		Toast.makeText(this, "one:"+w+",size:"+size, Toast.LENGTH_SHORT).show();
	}
}
