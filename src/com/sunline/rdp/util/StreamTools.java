package com.sunline.rdp.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import android.util.Base64;

public class StreamTools {
	/**
	 * 输入流转换成字符串
	 * 
	 */
	public static String readInputStream(InputStream is) {

		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int len = 0;
			byte[] buffer = new byte[1024];
			while ((len = is.read(buffer)) != -1) {
				baos.write(buffer, 0, len);
			}
			is.close();
			baos.close();
			byte[] result = baos.toByteArray();
			result = RdpStringTool.decompressBytes(result);
			result = Base64.decode(result, Base64.DEFAULT);
			String temp = new String(result,"UTF-8");
			return temp;
		} catch (Exception e) {
			return "获取失败";
		}

	}
}
