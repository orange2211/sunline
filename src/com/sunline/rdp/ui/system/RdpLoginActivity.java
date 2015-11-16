package com.sunline.rdp.ui.system;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sunline.rdp.R;
import com.sunline.rdp.ui.fuzai.Dp2101;
import com.sunline.rdp.util.HttpUtil;

public class RdpLoginActivity extends Activity
{
	private Button loginBtn;
	private EditText tellernoEt,passwordEt;
	private String tellerno="",password="";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rdplogin_lay);
		OnClickListener mylistener = new MyListener();
		loginBtn = (Button) findViewById(R.id.login);
		loginBtn.setOnClickListener(mylistener);
		tellernoEt = (EditText) findViewById(R.id.tellerno);
		passwordEt = (EditText) findViewById(R.id.password);
	}
	class MyListener implements OnClickListener
	{
		@Override
		public void onClick(View v)
		{
			String data = "";
			String uri = "http://10.10.20.10:19888/RdpServlet/RdpConsole?query,split,bin";
			tellerno = tellernoEt.getText().toString();
			password = passwordEt.getText().toString();
			int id = v.getId();
			Mytask mytask = new Mytask(); 
			switch (id)
			{
			case R.id.login:
//				data = "RDP_USERDATA=RDP_TELLERID="+tellerno+"#!@!*@RDP_BRANCHID=0098#!@!*@RDP_ENTITYID=9999#!@!*@RDP_PASSWORD="+password+"|*#!#*@|RDP_REQUESTTYPE=1|*#!#*@|RDP_SYSDATA=RDP_TASKID=rdploginin#!@!*@RDP_MAIN_TASKID=#!@!*@RDP_ACTIONTYPE=trxsubmit#!@!*@RDP_FORMID=#!@!*@RDP_CLIENTNO=010010070074#!@!*@RDP_CLIENTIP=10.10.70.74#!@!*@RDP_WARNINGCONFIRM=#!@!*@RDP_CLIENTHOSTNAME=orange#!@!*@RDP_TRXDATE=20151109#!@!*@RDP_HEJIJINE=#!@!*@RDP_CJSFSVRLST=#!@!*@RDP_FEIYQRBZ=0#!@!*@RDP_CPLFYXINX=#!@!*@RDP_SYSTEMID=core#!@!*@RDP_CONNECTSYSTEMID=core#!@!*@RDP_AUTHGUIYZWEN=#!@!*@RDP_AUTHGUIYZWBS=#!@!*@RDP_JIOYZWEN=#!@!*@RDP_JIOYZWBS=#!@!*@RDP_ERCDXINX=#!@!*@RDP_TELLERDYNAMICNO=#!@!*@RDP_TELLERDYNAMICPASSWORD=#!@!*@RDP_ZONGBSHU=#!@!*@RDP_VERIFYSEALRESULT=#!@!*@RDP_IDCARDCHECKRESULT=#!@!*@RDP_LDBIAOZI=#!@!*@RDP_LDRDPREF=#!@!*@RDP_SQQRENBZ=#!@!*@RDP_RDPREF=000535000170206004#!@!*@RDP_SHOUQMAA=|*#!#*@|RDP_TRXDATA=RDP_PASSWORD=111111#!@!*@guiydaih=000535#!@!*@guiymima=111111#!@!*@yngyjigo=0098#!@!*@jiaoyirq=20151109#!@!*@shoqkhao=#!@!*@caozyxha=#!@!*@zhiwxxia=#!@!*@zhiwxxib=#!@!*@qishibis=0#!@!*@chxunbis=20|*#!#*@|RDP_TRXDETAIL=<root><field id=\"RDP_CONTEXT_TASKID\" value=\"cmRwbG9naW5pbg==\"></field><field id=\"RDP_CONTEXT_FORMID\" value=\"\"></field><field id=\"RDP_CONTEXT_PREINDATA\" value=\"\"></field><field id=\"RDP_CONTEXT_INDATA\" value=\"UkRQX1BBU1NXT1JEPTExMTExMSohQCFndWl5ZGFpaD0wMDA1MzUqIUAhZ3VpeW1pbWE9MTExMTExKiFAIXluZ3lqaWdvPTAwOTgqIUAhamlhb3lpcnE9MjAxNTExMDkqIUAhc2hvcWtoYW89KiFAIWNhb3p5eGhhPSohQCF6aGl3eHhpYT0qIUAhemhpd3h4aWI9KiFAIXFpc2hpYmlzPTAqIUAhY2h4dW5iaXM9MjA=\"></field><field id=\"RDP_CONTEXT_OUTDATA\" value=\"\"></field><field id=\"RDP_CONTEXT_PAGEDATA\" value=\"\"></field></root>|*#!#*@|RDP_FIELDTYPE=|*#!#*@|RDP_FRONTCONFIG=|*#!#*@|RDP_PWDKEYDATA=|*#!#*@|RDP_EXTENDDATA=|*#!#*@|RDP_FLEXSEQ=010010070074201511091702065967220541229|*#!#*@|RDP_CRYPTVERSION=|*#!#*@|RDP_MAC=加密标识未开，直接返回";
//				try 
//				{
//					mytask.execute(uri,data);
//					
//				} catch (Exception e)
//				{
//					e.printStackTrace();
//				}
				Intent intent = new Intent(RdpLoginActivity.this, RdpSystemActivity.class);
				RdpLoginActivity.this.startActivity(intent);
				break;

			default:
				break;
			}
		}
	}
	class Mytask extends AsyncTask<String, Void, String>
	{
		@Override
		protected String doInBackground(String... params)
		{
			String uri =  params[0];
			String data = params[1];
			String result = "";
			result = HttpUtil.doPost(uri, data);
			return result;
		}
		@Override
		protected void onPostExecute(String result)
		{
			super.onPostExecute(result);
			
			Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(RdpLoginActivity.this, RdpSystemActivity.class);
			intent.putExtra("text", result);
			
			
			RdpLoginActivity.this.startActivity(intent);
		}
	}
	public String getLocalMacAddress() {
		WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
		WifiInfo info = wifi.getConnectionInfo();
		return info.getMacAddress();
	}
}
