package com.lao.Collectioon.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	/**
	 * LinkedList is implemented using Doubly linked list. This is best suited for insertion and deletion operations.
	 * Unlike ArrayList, this is not the best for retrieving the data.
	 * All the collections implements Serializable and cloneable Interfaces.
	 *  LinkedList also implements those Interfaces but not RandomAccess Interface.
	 */
	
	public void linkedListOperationsExample() {
		
		//Create a simple Linked list
		LinkedList<Integer>linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		
		System.out.println("LinkedList:" + linkedList);
		
		//Add an element to the First position.
		linkedList.addFirst(1);
		System.out.println("LinkedList after adding First:" + linkedList);
		
		//Add an element to the Last position.
				linkedList.addLast(5);
				System.out.println("LinkedList after adding Last:" + linkedList);
				
				/*
				 * LinkedList performs the worst if the operation is retrieval of data.
				 * Hence if our requirement is to fetch data, we should use ArrayList.
				 * But LinkedList is the best choice if we have requirements of adding and 
				 * removing data very often. In this case we should avoid ArrayList
				 */				
				
		//Get the First value
				System.out.println("first value:" + linkedList.getFirst());
				
		// Get the First value using index position		
				System.out.println("First value using index:" + linkedList.get(2));
				
				/*
				 * Now get the third value of the list.
				 * Since LinkedList has the data structure of doubly linked list,
				 * the value of the third index is known only to the link present in
				 * the Second index. Internally, the program will traverse to index number 2 and then only
				 * it can get the value of 3. So Linked list is not suited for search operations.
				 */		
				
				System.out.println("Third value using index:" + linkedList.get(3));
				
				//update the values using set().
				//Integer newFirst=linkedList.get(0);
				//linkedList.set(0, newFirst);
				//System.err.println("After 0th position updated :"+linkedList);
	
		// removeFirst and removeLast		
				System.out.println("remove First:" + linkedList.removeFirst());
				System.out.println(linkedList);
				System.out.println("remove Last:" + linkedList.removeLast());
				System.out.println(linkedList);
				
		//Poll method and PollFirst()deletes the First element in the list	
				System.out.println(linkedList.poll());
				System.out.println(linkedList);
				
		//PollLast deletes the Last
				linkedList.pollLast();
				System.out.println(linkedList);
				
		//remove deletes the First element		
				linkedList.remove();
				System.out.println(linkedList);
				
		//Adding		
				linkedList.addFirst(1);
				linkedList.add(2);
				linkedList.add(3);
				linkedList.add(4);
				linkedList.add(5);
				linkedList.add(6);
				
		//removeFirstOccurrence		
				linkedList.removeFirstOccurrence(2);
				System.out.println("After removing the first Occurance of 2" + linkedList);
				
		//removeLastOccurance		
				linkedList.removeLastOccurrence(6);
				System.out.println("After removing the last Occurance of 6" + linkedList);
				
				System.out.println("----------------------------------------------");		
	}
	
	//Iterator of LinkedList with simple For loop.
	
	public void iterateLinkedListWithsimpleForLoop() {
		
		LinkedList<String>linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("simple for loop");
		for (int index = 0;index<linkedList.size();index++) {
			System.out.println("Elements in the LL are: " +linkedList.get(index));
		}
		System.out.println("--------------------------------------------");	
	}
	
	//Iterator of LinkedList with Advanced For Loop(For Each)
	
	public void iterationLinkedListWithAdvancedForeach() {
		LinkedList<String>linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("For Each");
		for (String string: linkedList) {
			System.out.println("Elements in the LL are: " + string);
		}
		System.out.println("--------------------------------------------");			
	}
	
	//Iterate using while Loop.
	
	public void iterateUsingWhileLoop() {
		LinkedList<String>linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number = 0;
		System.out.println("While Loop");
		while (linkedList.size()>number) {
			System.out.println("Elements in the LL are: " + linkedList.get(number));		
		number++;
		}
		System.out.println("--------------------------------------");
	}
	
	//Iterate using Iterator
	
	public void iterateUsingIterator() {
		LinkedList<String>linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String>iterator = linkedList.iterator();
		System.out.println("Iterator");
		while (iterator.hasNext()){
			System.out.println("Elements in the LL are: " + iterator.next());
		}
		System.out.println("--------------------------------------------");			
	}

	
	
	public static void main(String[] args) {
		LinkedListExample linkedListExample = new LinkedListExample();
		//linkedListExample.linkedListOperationsExample();
		//linkedListExample.iterateLinkedListWithsimpleForLoop();
		//linkedListExample.iterationLinkedListWithAdvancedForeach();
		//linkedListExample.iterateUsingWhileLoop();
		linkedListExample.iterateUsingIterator();
	}
}
