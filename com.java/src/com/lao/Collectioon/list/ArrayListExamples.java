package com.lao.Collectioon.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExamples{
/* List(I)is the child of Collection(I).
 * ArrayList(C)is one of classes provides implementation for the List(I).
 * In list duplicate values are allowed and the insertion order is maintained.
 * The underlying DataBase is resizeable Array or Growable Array.
 * NOte:All the collections can store Heterogeneous objects can be stored except TREE SET and TREE
 * ArrayList and vector implements RandomAccess, Serializable and Cloneable Interface 
 * Synchronized->No
 * Thread safe->No
 * Default capacity-10
 * Fill Ratio or Load factor:1 or 100%
 * Growth rate:current_size + current_size/2
 */
public void arrayListExample() {
	
	List <String> arrayList = new ArrayList<String>();
	arrayList.add("Benz");
	arrayList.add("BMW");
	arrayList.add("Bugatti");
	arrayList.add("Bugatti");//duplicate
	arrayList.add("Bentley");
	
	System.out.println(arrayList);
	//retrieve
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.indexOf("Bugatti"));//automatically it will pick first one	
	System.out.println(arrayList.lastIndexOf("Bugatti"));//last object
	System.out.println(arrayList.indexOf("maruti"));//if element is not in list, automatically show -1 
	
	List<String>anotherList = new ArrayList<String>();
	anotherList.addAll(arrayList);//copy from arrayList to anotherList
	System.out.println(anotherList);
	
	anotherList.clear();//all elements
	System.out.println(anotherList);
	
	arrayList.remove(0);// Benz 0
	System.out.println(arrayList);
	
	arrayList.remove("Bugatti");// Bugatti 3
	System.out.println(arrayList);
	
	arrayList.add(null); //insertion null
	System.out.println(arrayList);
	
	arrayList.set(0, "chevrolet");// update new element
	System.out.println(arrayList);
	
	System.out.println(arrayList.isEmpty());//boolean method true or false
	
	//Iterate
	for (String string : arrayList) {
		System.out.println("using for each:" +string);
	}
	System.out.println("--------------------");
	for (int i=0;i<arrayList.size();i++) {
		System.out.println("using for loop:" +arrayList.get(i));
	}
	System.out.println("--------------------");
	ListIterator<String>iterator = arrayList.listIterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("--------------------");
	while(iterator.hasPrevious()) {
		System.out.println(iterator.previous());
	}
	System.out.println("--------------------");
	Iterator<String>Iterator = arrayList.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}	
}

	public static void main(String[] args) {
		
		ArrayListExamples example = new ArrayListExamples();
		example.arrayListExample();
		
		List a1 = new ArrayList();
		a1.add(1);
		a1.add("string");
		System.out.println(a1);
	}
	}