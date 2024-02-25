package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String>employeeMap = new HashMap<Integer,String>();
		//To insert an element Put method is used.
		employeeMap.put(1, "Agni");
		employeeMap.put(2, "Riya");
		employeeMap.put(3, "Arya");
		employeeMap.put(4, "Munima");
		employeeMap.put(5, "Duck");
		System.out.println("EmployeeMap:" + employeeMap);
		
		//To make a copy of the existing Map.
		Map<Integer,String>duplicateMap = new HashMap<Integer,String>();
		duplicateMap.putAll(employeeMap);
		System.out.println("DuplicateMap:" + duplicateMap);
		
		//clear to delete the map contents
		duplicateMap.clear();
		System.out.println("After clearing:" + duplicateMap);
		
		//To check if a key is present or not in the Map.
		System.out.println("Does this Map has key 1:" + employeeMap.containsKey(1));
		
		//To check if a value is present or not.
		System.out.println("Does this Map has value Arya:" +employeeMap.containsValue("Arya"));
		
		//Clone the Map
		System.out.println("Cloned Map:" + employeeMap.clone());
		
		//check if the Map is Empty or not.
		System.out.println("IsEmpty?:" + duplicateMap.isEmpty());
		
		//Fetch the set of keys in the Map(Note: Here it's not List of keys, it's set of keys.
		//Because List will allow duplicate but Set won't keys should be unique.
		System.out.println("KeySet:" + employeeMap.keySet());
		
		//Fetch a value.
		System.out.println(employeeMap.get(1));
		
		//Fetch all the values
		System.out.println("All values:" + employeeMap.values());
		
		//Entry Set
		System.out.println(employeeMap.entrySet());
	}

}
