package com.stu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换工具类
 * @author LARK
 *
 */
public class DateFormate {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String format(Date date) {
		return sdf.format(date);
	}
	
	public static Date parse(String date) {
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
