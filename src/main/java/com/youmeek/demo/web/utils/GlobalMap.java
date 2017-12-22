package com.youmeek.demo.web.utils;

import java.util.HashMap;

public class GlobalMap {

	public static HashMap<String, Object> map = new HashMap<>();

	private GlobalMap() {
		super();
	}

	private static GlobalMap instance = new GlobalMap();

	public static GlobalMap getInstance() {
		return instance;
	}

	public static void put(String k, Object v) {
		map.put(k, v);
	}

	public static void remove(String k) {
		map.remove(k);
	}

	public static Object get(String k) {
		Object obj = map.get(k);
		return obj;
	}
}
