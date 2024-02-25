package SetExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	/**
	 * LinkedHashSet->Child class of HashSet
	 * DS-> Hash table + Linked List
	 * Insertion order is preserved
	 * Duplicates not allowed
	 */
	
	public void linkedHashSetExample() {
	Set linkedHashSet = new LinkedHashSet();
	linkedHashSet.add(1);
	linkedHashSet.add("A");
	linkedHashSet.add("B");
	linkedHashSet.add("C");
	linkedHashSet.add("10");
	linkedHashSet.remove("10");
	
	System.out.println("Insertion Order preserved LinkedHashSet:" + linkedHashSet);
	System.out.println("Size:" + linkedHashSet.size());
	}
	public static void main(String[] args) {
		LinkedHashSetExample example= new LinkedHashSetExample();
		example.linkedHashSetExample();

	}

}
