package com.sunline.rdp.ui.fuzai;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.sunline.rdp.R; 
import com.sunline.rdp.adapter.MyFragmentPagerAdapter;

public class Dp2101 extends FragmentActivity  implements OnCheckedChangeListener,OnPageChangeListener 
{
    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;
    private ViewPager vpager;
    private MyFragmentPagerAdapter myAdapter;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_channel;
    private RadioButton rb_message;
    private RadioButton rb_better;
    private RadioButton rb_setting;	
    
    protected void onCreate(Bundle arg0)
	{
		super.onCreate(arg0);
		setContentView(R.layout.dp2101_lay);
		myAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
		bindViews();
	}
	
	
	@SuppressWarnings("deprecation")
	private void bindViews()
	{
	    rb_channel = (RadioButton) findViewById(R.id.rb_channel);
        rb_message = (RadioButton) findViewById(R.id.rb_message);
        rb_better = (RadioButton) findViewById(R.id.rb_better);
        rb_setting = (RadioButton) findViewById(R.id.rb_setting);
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rg_tab_bar.setOnCheckedChangeListener(this);
		vpager = (ViewPager) findViewById(R.id.viewpager);
		vpager.setAdapter(myAdapter);
		vpager.setCurrentItem(0);
		vpager.setOnPageChangeListener(this);
	}
	
	
	public void onCheckedChanged(RadioGroup group, int checkedId)
	{
		switch (checkedId)
		{
		 case R.id.rb_channel:
             vpager.setCurrentItem(PAGE_ONE);
             break;
         case R.id.rb_message:
             vpager.setCurrentItem(PAGE_TWO);
             break;
         case R.id.rb_better:
             vpager.setCurrentItem(PAGE_THREE);
             break;
         case R.id.rb_setting:
             vpager.setCurrentItem(PAGE_FOUR);
             break;

		default:
			break;
		}
		
	}
	
	
	public void onPageScrollStateChanged(int status)
	{
		//state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
		if(status == 2)
		{
			 switch (vpager.getCurrentItem()) {
             case PAGE_ONE:
                 rb_channel.setChecked(true);
                 break;
             case PAGE_TWO:
                 rb_message.setChecked(true);
                 break;
             case PAGE_THREE:
                 rb_better.setChecked(true);
                 break;
             case PAGE_FOUR:
                 rb_setting.setChecked(true);
                 break;
         }
		}
	}
	
	
	public void onPageScrolled(int arg0, float arg1, int arg2)
	{
	}
	
	public void onPageSelected(int arg0)
	{
	}
}
