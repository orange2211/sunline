package com.sunline.rdp.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class RdpStringTool
{
	public static byte[] compressBytes(byte input[]) 
	{
		Deflater compresser = new Deflater();
		
		compresser.reset();
		compresser.setInput(input);
		compresser.finish();
		byte output[] = new byte[0];
		ByteArrayOutputStream o = new ByteArrayOutputStream(input.length);
		try {
			byte[] buf = new byte[1024];
			int got;
			while (!compresser.finished()) {
				got = compresser.deflate(buf);
				o.write(buf, 0, got);
			}
			output = o.toByteArray();
		} finally {
			try {
				o.close();
			} catch (IOException e) {
			}
		}
		return output;
	}
	
	public static byte[] decompressBytes(byte input[]) 
	{
		Inflater decompresser = new Inflater();
		byte output[] = new byte[0];
		decompresser.reset();
		decompresser.setInput(input);
		ByteArrayOutputStream o = new ByteArrayOutputStream(input.length);
		try {
			byte[] buf = new byte[1024];
			int got;
			while (!decompresser.finished()) {
				got = decompresser.inflate(buf);
				o.write(buf, 0, got);
			}
			output = o.toByteArray();
		} catch (Exception e) 
		{
			e.printStackTrace();
		} finally {
			try {
				o.close();
			} catch (IOException e) {
			}
		}
		return output;
	}
}
