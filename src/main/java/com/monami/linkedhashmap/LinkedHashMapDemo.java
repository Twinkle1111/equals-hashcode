package com.monami.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

class Key {
	String key;

	Key(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		int hash = (int) key.charAt(0);
		System.out.println("hashCode for key: " + key + " = " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key) obj).key);
	}
}

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put(new Key("pallavi"), 80);
		map.put(new Key("Sniti"), 30);
		map.put(new Key("cabr"), 99);

		System.out.println();
		System.out.println("Value for key pallavi: " + map.get(new Key("pallavi")));
		System.out.println("Value for key vai: " + map.get(new Key("vai")));
		System.out.println("Value for key cabr: " + map.get(new Key("cabr")));

		System.out.println("Value for key sniti: " + map.get(new Key("sniti")));
	}
}
