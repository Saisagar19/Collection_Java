package collection.HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(5, "Kartik");
		h.put(6, "Aaditya");
		h.put(7, "Paras");
		h.put(8, "Sanskar");

		System.out.println("HashMap 1:" + h);
		System.out.println("--------------");

		// it will print data in set model
		System.out.println(h.entrySet());

		// it will print the unique key
		System.out.println(h.keySet());

		// it will print values
		System.out.println(h.values());
		System.out.println("--------------");

		// Provide Generic
		HashMap<Integer, String> ht = new HashMap<Integer, String>();
		ht.put(1, "Rahul");
		ht.put(2, "Rohit");
		ht.put(3, "Rajesh");
		ht.put(4, "Raunak");
		System.out.println("HashMap 2:" + ht);
		System.out.println("--------------");

		// Adding one HashMap to another HashMap
		h.putAll(ht);
		System.out.println("updated HashMap 1:" + h);
		System.out.println("--------------");

		// if the HashMap is empty or not
		System.out.println(h.isEmpty());

		// Get the value using unique key
		System.out.println(h.get(4));

		// check if the element contains key or not
		System.out.println(h.containsKey(4));

		// check if the element contains value or not
		System.out.println(h.containsValue("Raunak"));

		// remove element on basis of key
		System.out.println(h.remove(4));
		System.out.println(h);

		// remove element on basis of key and object (Duplicate value can be there)
		System.out.println(h.remove(null, 78));
		System.out.println(h);

		// to print size of hashMap
		System.out.println(h.size());

		// replace element on basis of key
		h.replace(3, "Ganesh");
		System.out.println(h);

		// replace element on basis of key old value and new value
		h.replace(2, "Rohit", "Sahil");
		System.out.println(h);

	}
}
