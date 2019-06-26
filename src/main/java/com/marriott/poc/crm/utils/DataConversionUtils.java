package com.marriott.poc.crm.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class DataConversionUtils {

	public static String formatStringDate(String strData) throws Exception {
		StringBuilder strFinalData = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(strData, "T");
		while (st1.hasMoreTokens()) {
			strFinalData.append(st1.nextToken());
			strFinalData.append(" ");
		}
		return strFinalData.toString();
	}
	
	public static String generateOdsLoadDateTime() throws Exception {
		String strOdsLoadDateTime = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss.SS").format(new Timestamp(System.currentTimeMillis()));
		return strOdsLoadDateTime;
	}

}
