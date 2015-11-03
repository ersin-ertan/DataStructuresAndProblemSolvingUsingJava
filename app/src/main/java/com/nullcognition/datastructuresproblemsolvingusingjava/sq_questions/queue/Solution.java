package com.nullcognition.datastructuresproblemsolvingusingjava.sq_questions.queue;
// ersin 03/11/15 Copyright (c) 2015+ All rights reserved.

// Question: Implement a queue from scratch

// Concept: add to the head or tail, can implement a priority system

// Operations: add, remove, peek, empty, poll, add all, replace, size - head, tail, full structure, - resize larger and smaller - comparator

// Properties: traversal is linear, head and tail operations are constant, bounded, unbounded

// Structure: node linking to the next object


import java.lang.ref.WeakReference;
import java.util.Collection;

// solution is meh, could be better with correct usage of weak ref for head and tail, and better choice of top level abstract Queue operations

public class Solution{

	Queue stdQueue = new StdQueue<>();

	{
		stdQueue.add(new Node<Object>(new Object(), null, null));
	}
}


abstract class Queue{

	protected WeakReference<Node> head;
	protected WeakReference<Node> tail;
	protected int size = 16;

	abstract public boolean add(Node node); // if bounded change return type to boolean to notify of success or failure on insertion

	abstract public Node remove();

	abstract public Node peek(); // peek - head and tail

	abstract public void clear();

	abstract public void replace();

	abstract public int size(); // used to check for add operations when bounded, remove in general
}


class Node<T>{

	public Node(T inObject, WeakReference<T> pre, WeakReference<T> post){
		object = inObject;
		preNode = pre;
		postNode = post;
	}

	private Node(final T inObject){
		object = inObject;
	} // we are allowing null objects into the queue

	public Node<T> immutable(){
		return new Node<>(object);
	}

	private T object;

	public T getObject(){ return object; }

	public void setObject(T inObject){ object = inObject; }

	WeakReference<T> preNode;
	WeakReference<T> postNode;
}


class StdQueue<T> extends Queue{

	public StdQueue(){}

	public StdQueue(int inSize){ size = inSize; }

	public StdQueue(int inSize, Collection<T> addAll){ size = inSize; } // TODO addall with collection, poll collections and current size of structure if bounded and add only the right amount to fill the queue

	@Override public boolean add(Node inNode){
		if(size() == 0){ head = new WeakReference<Node>(inNode); }
		else{ tail.get().postNode = new WeakReference<Node>(inNode); }
		++size;
		return true;
	}

	@Override public Node remove(){
		Node oldHead = head.get();
		if(size() == 1){ head.clear(); }
		else{ head = oldHead.postNode; }
		--size;
		return oldHead;
	}

	@Override public Node peek(){
		return head.get().immutable();
	}

	@Override public void clear(){
		head.clear();
		size = 0;
	}

	@Override public void replace(){

	}

	@Override public int size(){
		return size;
	}
}


