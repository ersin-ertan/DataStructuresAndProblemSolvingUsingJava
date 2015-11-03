package com.nullcognition.datastructuresproblemsolvingusingjava.sq_questions.lru;
// ersin 03/11/15 Copyright (c) 2015+ All rights reserved.


import java.util.HashMap;
import java.util.LinkedHashMap;

// bucket is where the key and the value is stored,
// in the doubly linked list if two object have the same key thus they hash to the same value
// within the bucket stored in the linked list,

// every time a cached value is needed, it is put to the end of the list, thus on insertion, the head is removed and
// thus there is a new head, no array reordering is required


public class Solution{

	LinkedHashMap <Integer, Object> lru = new Lru<>(8);

	{
		lru.put(2, new Object()); // which will remove the eldest entry since access order is true
	}
}


class Lru<K, V> extends LinkedHashMap<K, V>{

	static final float DEFAULT_LOAD_FACTOR = 1.00F; // will never reach this
	int capacity;

	public Lru(int cap){
		super(cap + 1, DEFAULT_LOAD_FACTOR, true);
		capacity = cap ;

		// load factor is how full the structure has to be prior to the hash table rehashing the object, thus creating double as many buckets

		// if the ordering should be done based on the last access (from least-recently accessed to most-recently accessed),
		// and if the ordering should be the order in which the entries were inserted.
	}

	@Override protected boolean removeEldestEntry(final Entry<K, V> eldest){
		return (size() > this.capacity);
	}
}
