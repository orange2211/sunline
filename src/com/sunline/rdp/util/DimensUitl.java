package com.sunline.rdp.util;

import android.app.Dialog;
import android.view.View;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;

/**
 * @author 作者： Administrator
 *
 * @version 创建时间：2014年10月14日下午4:21:31
 */
public class DimensUitl {
	int width, height;

	public DimensUitl() {
		this.width = 0;
		this.height = 0;
		System.out.println(this.width +"/"+ this.height);
	}

	public AbsListView.LayoutParams getItemParams(View view,
			double heightCoefficient) {
		LinearLayout.LayoutParams layoutParams = (LayoutParams) view
				.getLayoutParams();
		layoutParams.height = (int) (height * heightCoefficient);
		return new AbsListView.LayoutParams(layoutParams);

	}

	public LayoutParams getLayoutParams(View view, double heightCoefficient) {
		LayoutParams params = (LayoutParams) view.getLayoutParams();
		params.height = (int) (height * heightCoefficient);
		return params;
	}

	public LayoutParams getLayoutParams(View view, double heightCoefficient,
			double widthCoefficient) {
		LayoutParams params = (LayoutParams) view.getLayoutParams();
		params.width = (int) (int) (width * widthCoefficient);
		params.height = (int) (height * heightCoefficient);
		return params;
	}

	public LinearLayout.LayoutParams getParamsByLinearLayout(View view,
			double heightCoefficient) {
		LinearLayout.LayoutParams params = (LayoutParams) view
				.getLayoutParams();
		params.height = (int) (height * heightCoefficient);
		return params;
	}

	public LinearLayout.LayoutParams getParamsByLinearLayout(View view,
			double heightCoefficient, double widthCoefficient) {
		LinearLayout.LayoutParams params = (LayoutParams) view
				.getLayoutParams();
		params.width = (int) (int) (width * widthCoefficient);
		if (heightCoefficient != 0) {
			params.height = (int) (int) (height * heightCoefficient);
		}
		return params;
	}

	public RelativeLayout.LayoutParams getParamsByRelativeLayout(View view,
			double heightCoefficient) {
		RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view
				.getLayoutParams();
		params.height = (int) (height * heightCoefficient);
		System.out.println("width:"+params.width);
		System.out.println("height:"+params.height);
		return params;
	}

	public RelativeLayout.LayoutParams getParamsByRelativeLayout(View view,
			double heightCoefficient, double widthCoefficient) {
		RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view
				.getLayoutParams();
		params.width = (int) (int) (width * widthCoefficient);
		params.height = (int) (int) (height * heightCoefficient);
		return params;
	}

	public void setDialogWidth(Dialog dialog, int width) {
		WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
		lp.width = width;
		dialog.getWindow().setAttributes(lp);
	}

	public void setDialogHeight(Dialog dialog, int height) {
		WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
		lp.height = height;
		dialog.getWindow().setAttributes(lp);
	}
}
