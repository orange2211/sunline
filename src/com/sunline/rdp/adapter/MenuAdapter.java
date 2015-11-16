package com.sunline.rdp.adapter;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sunline.rdp.R;
import com.sunline.rdp.entity.Icon;
import com.sunline.rdp.ui.fuzai.Dp2101;
import com.sunline.rdp.ui.fuzai.Tl5205;


public class MenuAdapter extends BaseAdapter
{
	List<Icon> listIcons;
	private Context context;
	private LayoutInflater layInflater;// 布局生成者
	public MenuAdapter(List<Icon> listIcons, Context context)
	{
		super();
		this.listIcons = listIcons;
		this.context = context;
		Log.v("TEST", "listIcons:"+listIcons);
		layInflater = LayoutInflater.from(context);
	}
	@Override
	public int getCount()
	{
		return listIcons.size();
	}

	@Override
	public Object getItem(int position)
	{
		return listIcons.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ListIconView listIconView = new ListIconView();
		convertView = layInflater.inflate(R.layout.gridview_lay, null);
		listIconView.setIcon((ImageView)convertView.findViewById(R.id.img_icon));
		listIconView.setIco_tit((TextView)convertView.findViewById(R.id.txt_icon));
		Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), listIcons.get(position).getiId());
		listIconView.icon.setImageBitmap(bitmap);
		listIconView.ico_tit.setText(listIcons.get(position).getiName());
		convertView.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent(context, Tl5205.class);
				context.startActivity(intent);
			}
		});
		return convertView;
	}
	
	
	final class ListIconView
	{
		private ImageView icon;
		private TextView ico_tit;
		public ImageView getIcon()
		{
			return icon;
		}
		public void setIcon(ImageView icon)
		{
			this.icon = icon;
		}
		public TextView getIco_tit()
		{
			return ico_tit;
		}
		public void setIco_tit(TextView ico_tit)
		{
			this.ico_tit = ico_tit;
		}
		
	}
}
