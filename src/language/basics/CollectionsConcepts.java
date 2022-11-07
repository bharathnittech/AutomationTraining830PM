package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsConcepts {

	// 1. Fixed in Length
	// 2. Similar Data Types only allowed ==> Not Solved
	// 3. memory allocation will happen while initiating the array itself (Static)
	// 4. Modifications are not allowed

	public static void main(String[] args) {

		// Collections

		// 1. List ==> ArrayList and LinkedList

//		==> List Can Store multiple values with Same data type
//		==> List will allocate memory dynamically to store values (Only when it's required)
//		==> No need to specify size (like length in Array)
//		==> Modifications Allowed
//		==> LIST CAN STORE DUPLICATE VALUES

		// 2. Set ==> HashSet , LinkedHashSet and TreeSet

//		==> Set Can Store multiple values with Same data type
//		==> Set will allocate memory dynamically to store values (Only when it's required)
//		==> No need to specify size (like length in Array)
//		==> Modifications Allowed
//		==> SET CANNOT STORE DUPLICATE VALUES

		// 3. Map <Key, Value> ==> HashMap, LinkedHashMap, TreeMap and Hashtable
//		==> Map Can Store multiple values with different data types together (2 data types)
//		==> Map will allocate memory dynamically to store values (Only when it's required)
//		==> No need to specify size (like length in Array)
//		==> Modifications Allowed
//		==> MAP ALLOW DUPLICATE VALUES BUT WILL NOT ALLOW DUPLICATE KEYS

//		Syntax of Collections : 

//		Collection<DataType> Variable = new CollectionName<DataType>();
//		Syntax to store values : Variable.add(Value);
//		Syntax to store values : Variable.get(Index);	

		/********* ArrayList ***********/
		System.out.println("========ArrayList========");
		// Order of Storing the Values ==> Insertion Order
		// Storing null values ==> Can store null values

		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Pramod");
		empNamesArrayList.add("Aishwarya");
		empNamesArrayList.add("Amit");
		empNamesArrayList.add("Pramod");
		empNamesArrayList.add(null); // null meaning no value (literal) ==> getting memory from computer but not
										// storing any value
//		empNamesArrayList.remove("Amit");

		System.out.println(empNamesArrayList);

		/********* LinkedList ***********/
		System.out.println("========LinkedList========");
		// Order of Storing the Values ==> Insertion Order
		// Storing null values ==> Can store null values

		List<String> empNamesLinkedList = new LinkedList<String>();
//		System.out.println("Size of LinkedList while Initiating: "+empNamesLinkedList.size());
		empNamesLinkedList.add("Pramod");
		empNamesLinkedList.add("Aishwarya");
		empNamesLinkedList.add("Amit");
		empNamesLinkedList.add("Pramod");
		empNamesLinkedList.add(null);

		System.out.println(empNamesLinkedList);

		// Hash ==> Random , Link ==> Insertion , Tree ==> Alphabetical/Ascending

		/********* HashSet ***********/

		System.out.println("========HashSet========");
		// Order of Storing the Values ==> Random Order
		// Storing null values ==> Null values are allowed

		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Pramod");
		empNamesHashSet.add("Dhruv");
		empNamesHashSet.add("Aishwarya");
		empNamesHashSet.add("Amit");
		empNamesHashSet.add("Pramod");
		empNamesHashSet.add(null);

		System.out.println(empNamesHashSet);

		/********* LinkedHashSet ***********/

		System.out.println("========LinkedHashSet========");
		// Order of Storing the Values ==> Insertion Order
		// Storing null values ==> Null values are allowed

		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Pramod");
		empNamesLinkedHashSet.add("Dhruv");
		empNamesLinkedHashSet.add("Aishwarya");
		empNamesLinkedHashSet.add("Amit");
		empNamesLinkedHashSet.add("Pramod");
		empNamesLinkedHashSet.add(null);

		System.out.println(empNamesLinkedHashSet);

		/********* TreeSet ***********/

		System.out.println("========TreeSet========");
		// Order of Storing the Values ==> Alphabetical Order
		// Storing null values ==> Null values are not allowed

		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Pramod");
		empNamesTreeSet.add("Dhruv");
		empNamesTreeSet.add("Aishwarya");
		empNamesTreeSet.add("Amit");
		empNamesTreeSet.add("Pramod");
//		empNamesTreeSet.add(null);

		System.out.println(empNamesTreeSet);

		// Map Concepts  ==> Duplicate Values allowed but Duplicate Keys are not allowed
		
		System.out.println("========HashMap========");
		//Order ==> Random Order of Keys
		//Null Values ==> Null keys Allowed and Null Values also allowed
		
		Map<String, Integer> empDetailsHashMap = new HashMap<String, Integer>();
		empDetailsHashMap.put("Pramod", 1);
		empDetailsHashMap.put("Dhruv", 2);
		empDetailsHashMap.put("Aishwarya", 2);
		empDetailsHashMap.put("Amit", 4);
		empDetailsHashMap.put("Pramod", 5);
		empDetailsHashMap.put("ABC", null);
		empDetailsHashMap.put(null, 7);
		
		System.out.println(empDetailsHashMap);
		
		System.out.println("========LinkedHashMap========");
		//Order ==> Insertion Order of Keys
		//Null Values ==> Null keys Allowed and Null Values also allowed
		
		Map<String, Integer> empDetailsLinkedHashMap = new LinkedHashMap<String, Integer>();
		empDetailsLinkedHashMap.put("Pramod", 1);
		empDetailsLinkedHashMap.put("Dhruv", 2);
		empDetailsLinkedHashMap.put("Aishwarya", 2);
		empDetailsLinkedHashMap.put("Amit", 4);
		empDetailsLinkedHashMap.put("Pramod", 5);
		empDetailsLinkedHashMap.put("ABC", null);
		empDetailsLinkedHashMap.put(null, 7);
		
		System.out.println(empDetailsLinkedHashMap);
		
		System.out.println("========TreeMap========");
		//Order ==> Alphabetical Order of Keys
		//Null Values ==> Null keys not Allowed, Null Values are allowed
		
		Map<String, Integer> empDetailsTreeMap = new TreeMap<String, Integer>();
		empDetailsTreeMap.put("Pramod", 1);
		empDetailsTreeMap.put("Dhruv", 2);
		empDetailsTreeMap.put("Aishwarya", 2);
		empDetailsTreeMap.put("Amit", 4);
		empDetailsTreeMap.put("Pramod", 5);
		empDetailsTreeMap.put("ABC", null);
//		empDetailsTreeMap.put(null, 7);
		
		System.out.println(empDetailsTreeMap);
		
		System.out.println("========Hashtable========");
		//Order ==> Random Order of Keys
		//Null Values ==> Null keys not Allowed, Null Values also not allowed
		
		Map<String, Integer> empDetailsHashtable = new Hashtable<String, Integer>();
		empDetailsHashtable.put("Pramod", 1);
		empDetailsHashtable.put("Dhruv", 2);
		empDetailsHashtable.put("Aishwarya", 2);
		empDetailsHashtable.put("Amit", 4);
		empDetailsHashtable.put("Pramod", 5);
//		empDetailsHashtable.put("ABC", null);
//		empDetailsHashtable.put(null, 7);
		
		System.out.println(empDetailsHashtable);
		
		
		List<String> promodDetails = new ArrayList<String>();
		promodDetails.add("Mumbai");
		promodDetails.add("Btech");
		promodDetails.add("MH");
		promodDetails.add("436637");
		promodDetails.add("64567934734");
		
		Map<String, List<String>> empDetails = new HashMap<String, List<String>>();
		empDetails.put("promod", promodDetails);
		
		System.out.println(empDetails.get("promod").get(3));
		
		
	}

}
