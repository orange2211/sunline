package com.sunline.rdp.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyStore;
import java.util.Map;

import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

import com.sunline.rdp.ssl.SSLSocketFactoryEx;

public class HttpUtil {

	private String jSONString;
	private String TAG = "httpTools";
	private String result = null;

	public HttpUtil() {
	}
	public static HttpClient getNewHttpClient() {  
        try {  
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());  
            trustStore.load(null, null);  
            
            SSLSocketFactory sf = new SSLSocketFactoryEx(trustStore);  
            sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);  
    
            HttpParams params = new BasicHttpParams();  
            HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);  
            HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);  
    
            SchemeRegistry registry = new SchemeRegistry();  
            registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));  
            registry.register(new Scheme("https", sf, 443));  
    
            ClientConnectionManager ccm = new ThreadSafeClientConnManager(params, registry);  
    
            return new DefaultHttpClient(ccm, params);  
        } catch (Exception e) {  
            return new DefaultHttpClient();  
        }  
    }  
	/**
	 * 
	 * 
	 * @param path
	 * @param data
	 * @return
	 */
	public static String doPost(String path, String data) {
		// 路径
		try {
			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setConnectTimeout(15000);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false); // 不允许使用缓存
			System.out.println("提交路径：" + path); 
			System.out.println("请求数据：" + data);
			long iStartTime = System.currentTimeMillis();
			connection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			connection.setDoOutput(true);
			OutputStream os = connection.getOutputStream();
			os.write(RdpStringTool.compressBytes(data.getBytes()));

			int code = connection.getResponseCode();
			System.out.println("请求时间:" + (System.currentTimeMillis() - iStartTime));
			System.out.println("返回码：" + code);
			if (code == 200) {
				// 请求成功
				InputStream is = connection.getInputStream();

				String text = StreamTools.readInputStream(is);
				System.out.println("服务器返回数据：" + text);
				return text;
			} else {
				// 请求失败
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("当前路径为："+path+"网络连接超时");
			return null;
		}
	}

	public String getJson(Map<String, Object> params) {
		JSONObject jsonRequest = new JSONObject();
		try {
			if (params != null) {
				for (String key : params.keySet()) {
					jsonRequest.put(key, params.get(key));
				}
			}
			jSONString = jsonRequest.toString();
		} catch (Exception e) {
		}
		return jSONString;
	}
}
