package com.sunline.rdp.ui.fuzai;

import com.sunline.rdp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 基本信息
 * @author chengzhi
 *
 */
public class FragmentBaseInfo extends Fragment
{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragmentbase, container,false);
	}
}
