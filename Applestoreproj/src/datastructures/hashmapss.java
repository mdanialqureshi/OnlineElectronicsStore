package datastructures;

import java.util.HashMap;

public class hashmapss {

	HashMap<String, Integer> map = new HashMap<String, Integer>();
	HashMap<String, Integer> macmap2 = new HashMap<String, Integer>();
	HashMap<String, Integer> accessoriesmap2 = new HashMap<String, Integer>();

	public HashMap<String, Integer> getiphonehash() {
		map.put("iPhone SE", 469);
		map.put("iPhone 6", 499);
		map.put("iPhone 6s", 599);
		map.put("iPhone 6s Plus", 739);
		map.put("iPhone 7", 739);
		map.put("iPhone 7 Plus", 899);
		map.put("iPhone 8", 929);
		map.put("iPhone 8 Plus", 1059);
		map.put("iPhone X", 1319);

		return map;
	}

	public HashMap<String, Integer> getmachashmap() {
		macmap2.put("MacBook", 1729);
		macmap2.put("MacBook Air", 1199);
		macmap2.put("MacBook Pro", 2399);
		macmap2.put("iMac", 1399);
		macmap2.put("iMac Pro", 6299);
		return macmap2;
	}

	public HashMap<String, Integer> getaccesoriesmap() {
		accessoriesmap2.put("Earpods", 35);
		accessoriesmap2.put("Airpods", 219);
		accessoriesmap2.put("USB Charging Cable", 35);
		accessoriesmap2.put("USB-C Charging Cable", 35);
		return accessoriesmap2;
	}

}
