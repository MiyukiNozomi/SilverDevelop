package com.silver.develop;

import java.util.LinkedHashMap;

import javax.swing.ImageIcon;

public class Resource {
	
	private static LinkedHashMap<String, ImageIcon> icons = new LinkedHashMap<>();
	
	public static ImageIcon getIcon(String icon) {
		if (icons.containsKey(icon)) {
			return icons.get(icon);
		} else {
			ImageIcon e = new ImageIcon(Resource.class.getResource("/res/silver/develop/icons/" + icon));
			icons.put(icon, e);
			return e;
		}
	}
	
}
