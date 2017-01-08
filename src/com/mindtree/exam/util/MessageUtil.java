package com.mindtree.exam.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MessageUtil {
	private static final ResourceBundle BUNDLE  = ResourceBundle.getBundle("");
	public static String getString(String key)
	{
		try {
			String value = BUNDLE.getString(key);
			return value;
			
		} catch (MissingResourceException e) {
			return "!"+key+"!";
		}
	}
}
