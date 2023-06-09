package com.tuling.testConversionService;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把日期字符串转为Date类型的转换器
 */
public class String2DateConversionService implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			return null;
		}
	}
}
