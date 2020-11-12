package exam816.chapter3.collections4;

import java.util.*;
import java.util.function.BiFunction;

public class ListSetMapAndQueues {
	//Ordered collection of elements, allows duplicates, list can be accessed by an int index.
	List list1 = new ArrayList();
	List list2 = new LinkedList();
	
	//Collection that does not allow duplicate entries.
	Set set1 = new HashSet();
	Set set2 = new TreeSet();
	
	// orders elements in a specific order for processing. Ex: first-in, first-out.
	Queue queue1 = new LinkedList();
	
	//Collection that maps keys to values, with no duplicate keys allowed.
	Map map1 = new HashMap();
	Map map2 = new TreeMap();
	
	//Check Figure 3.1
	
}

class CollectionsInterface {
	public static void main(String[] args) {
		//add, boolean add(E element)
			List list3 = new ArrayList();
			System.out.println("-----ADD----");
			System.out.println(list3.add(123)); //true
			
			System.out.println("-----ADD SET----");
			Collection<String> set = new HashSet<>();
			System.out.println(set.add("Sparrow")); // true
			System.out.println(set.add("Sparrow")); // false
		
		//remove, boolean remove(Object object)
			System.out.println("-----remove----");
			Collection<String> birds = new ArrayList<>(); //*
			birds.add("hawk");                            // [hawk]
			birds.add("hawk");                            // [hawk, hawk]
			System.out.println(birds);                    // [hawk, hawk]
			System.out.println(birds.remove("cardinal")); // false
			System.out.println(birds.remove("hawk"));     // true
			System.out.println(birds);                    // [hawk]
			birds.add("test");                    // [hawk, test]
			System.out.println(birds.remove(0));     // hawk *
			System.out.println(birds);                    // [test]
		
		//Deleting while looping
		
			//for (String bird : birds) // ConcurrentModificationException
			//	birds.remove(bird);
		
		// isEmpty and size  boolean isEmpty(), int size(), how many elements are in the Collection.
		
			System.out.println("-----isEmpty and Size----");
			Collection<String> birds2 = new ArrayList<>();
			System.out.println(birds2.isEmpty()); // true
			System.out.println(birds2.size());    // 0
			birds2.add("hawk");                   // [hawk]
			birds2.add("hawk");                   // [hawk, hawk]
			System.out.println(birds2.isEmpty()); // false
			System.out.println(birds2.size());    // 2
		
		//clear, void clear(), discard all elements of a Collection.
			System.out.println("-----clear---");
			Collection<String> birds3 = new ArrayList<>();
			birds3.add("hawk");                   // [hawk]
			birds3.add("hawk");                   // [hawk, hawk]
			System.out.println(birds3.isEmpty()); // false
			System.out.println(birds3.size());    // 2
			birds3.clear();                       // []
			System.out.println(birds3.isEmpty()); // true
			System.out.println(birds3.size());    // 0
		
		//contains, boolean contains(Object object)
			System.out.println("-----contains---");
			Collection<String> birds4 = new ArrayList<>();
			birds4.add("hawk"); // [hawk]
			System.out.println(birds4.contains("hawk"));  // true
			System.out.println(birds4.contains("robin")); // false
		
		//removeIf, boolean removeIf(Predicate<? super E> filter) *
			System.out.println("-----removeIf---");
			Collection<String> list2 = new ArrayList<>();
			list2.add("Magician");
			list2.add("Assistant");
			System.out.println(list2);     // [Magician, Assistant]
			list2.removeIf(s -> s.startsWith("A")); //String::startsWith; *
			System.out.println(list2);     // [Magician]
		
		//forEach, void forEach(Consumer<? super T> action), loops through a Collection
			System.out.println("-----forEach---");
			Collection<String> cats = Arrays.asList("Annie", "Ripley");
			cats.forEach(System.out::println);
			cats.forEach(c -> System.out.println(c));
	}
}

class ListInterface {
	//Check Figure 3.2 Example of a list.
	
	//Many List implementations can change in size after they are declared.
	
	//The main thing that all List implementations have in common is that they are ordered and allow duplicates.
	
	//ArrayList: Resizable array. Look up any element in constant time. Adding or removing is slower. Reading >= Writting.
	
	//LinkedList: implements List and Queue, have all method from List and also methods to handle add and remove from beg and/or end.
		// Main benefit is that it can be handle as a Queu, Trade-off dealing with arbitrary index talkes linear time.
	
	
	//Creating a List with a Factory
	
	//Check table 3.4 Factory methods to create a List
	public static void main(String[] args) {
		
		String[] array = new String[] {"a", "b", "c"};
		
		List<String> asList = Arrays.asList(array); // [a, b, c]
		List<String> of = List.of(array);           // [a, b, c]
		List<String> copy = List.copyOf(asList);    // [a, b, c]
		
		array[0] = "z";
		System.out.println(asList); // [z, b, c]
		System.out.println(of);     // [a, b, c]
		System.out.println(copy);   // [a, b, c]
		asList.set(0, "x");
		System.out.println(Arrays.toString(array)); // [x, b, c]
		//copy.add("y");  // throws UnsupportedOperationException
		//of.add("2");
		
		//Working with List Methods
			//Check table 3.5 List methods
			System.out.println("-----List Methods -----");
			List<String> list = new ArrayList<>();
			list.add("SD");                  // [SD]
			list.add(0, "NY"); // [NY,SD]
			System.out.println(list.set(1, "FL"));               //out: SD, [NY,FL]
			System.out.println(list.get(0)); // NY
			list.remove("NY");               // [FL]
			list.remove(0);                  // []
			//list.set(0, "?");                // IndexOutOfBoundsException
		
			List<Integer> numbers = Arrays.asList(1, 2, 3);
			numbers.replaceAll(x -> x*2);
			//numbers.forEach(x -> x = x*2);
			System.out.println(numbers);   // [2, 4, 6]
		
			Iterator<String> iter = list.iterator();
			while(iter.hasNext()) {
				String string = iter.next();
				System.out.println(string);
			}
		
	}
}

class SetInterface {
	//Don't want duplicate entries
	//Check FIGURE 3.3 Example of a Set
	
	//Comparing Ser Implementations
	public static void main(String[] args) {
		
		Set<Character> letters = Set.of('z', 'o', 'o');
		Set<Character> copy = Set.copyOf(letters);
		
		Set set1 = new HashSet(); //hash table, keys are a hash, uses a hashcode to retrieve them more efficiently.
		// Add and Read have cosntant times. Losses order of insertion.
		
		System.out.println("------Hash Set-----");
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);    // true
		boolean b2 = set.add(10);    // true
		boolean b3 = set.add(66);    // false
		boolean b4 = set.add(8);     // true
		set.forEach(System.out::println); //66... 8... 10 uses equals() and hashcode()
		
		
		Set set2 = new TreeSet(); //tree structure, always in a sorted order. Add and read takes longer than HashSet
		
		System.out.println("------Tree Set-----");
		Set<Integer> setb = new TreeSet<>();
		boolean b1b = set.add(66); // true
		boolean b2b = set.add(10); // true
		boolean b3b = set.add(66); // false
		boolean b4b = set.add(8);    // true
		setb.forEach(System.out::println); //8... 10... 66... natural sorted order, uses Comparable interface (Pending)
		
		
		//Check Figure 3.4 Examples of a HashSet and TreeSet
		
		
		
		
	}
}

class QueueInterface {
	// Elements added and remove in a specific order.
	// Sorting elements prior to processing them
	// FIFO, LIFO (stack). Check Figure 3.5 Example of a Queue
	private Queue<String> queueStrings = new LinkedList<>(); //Double-ended queue
	private Queue<String> queueStrings2 = new ArrayDeque<>(); //Double-ended queue, more efficient (not on this exam)
	
	//Queu Methods.
	//Table 3.6 Queue methods
	
	public static void main(String[] args) {
		System.out.println("----- Queue Methods -----");
		//check Figure 3.6 Working with queue
		
		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue.offer(10)); // true
		System.out.println(queue.offer(4));  // true
		System.out.println(queue.peek());    // 10
		System.out.println(queue.poll());    // 10
		System.out.println(queue.poll());    // 4
		System.out.println(queue.peek());    // null
		//System.out.println(queue.element());    // null
		//System.out.println(queue.remove());    // null
	}
}

class MapInterface {
	//Identify values by a Key.
	//TreeMap is sorted.
	//Check Figure 3.7 Example of a Map
	
	public static void main(String[] args) {
		Map<String, String> mapOf = Map.of("key1", "value1", "key2", "value2");
		Map<String, String> mapCopy = Map.copyOf(mapOf);
		
		//Better way to handle/read pairs
			//		Map.ofEntries(
			//				Map.entry("key1", "value1"),
			//				Map.entry("key1", "value1"));
		
		//Comparing Map implementations
		Map<String, String> hashMap = new HashMap<>(); //Hash Table, uses hashCode of keys, add and read constant time. - lose order of insert.
		Map<String, String> treeMap = new TreeMap<>(); //Sorted tree structure, + keys always in a sorted order, - adding and checking takes longer.
		
		//Working with Map Methods
		//Check Table 3.7 Map Methods
		
		//Basic Methods
			System.out.println("----- Basic Methods ----");
			Map<String, String> map = new HashMap<>();
			map.put("koala", "bamboo");
			map.put("lion", "meat");
			map.put("giraffe", "leaf");
			String food = map.get("koala"); // bamboo
			for (String key: map.keySet())
				System.out.print(key + ","); // koala,giraffe,lion, = keys not sorted because it uses the hashcode
			
			Map<String, String> mapTree = new TreeMap<>();
			mapTree.put("koala", "bamboo");
			mapTree.put("lion", "meat");
			mapTree.put("giraffe", "leaf");
			String food2 = mapTree.get("koala"); // bamboo
			for (String key: mapTree.keySet())
				System.out.print(key + ","); // giraffe,koala,lion, = keys input Sorted
		
		//System.out.println(map.contains("lion")); // DOES NOT COMPILE
			System.out.println(map.containsKey("lion")); // true
			System.out.println(map.containsValue("lion")); // false
			System.out.println(map.size()); // 3
			map.clear();
			System.out.println(map.size()); // 0
			System.out.println(map.isEmpty()); // true
		
		//forEach and entrySet
			System.out.println("----- For each and entry set----");
			Map<Integer, Character> mapFE = new HashMap<>();
			mapFE.put(1, 'a');
			mapFE.put(2, 'b');
			mapFE.put(3, 'c');
			mapFE.forEach((k, v) -> System.out.println(v)); //*
			
			mapFE.values().forEach(System.out::println);
		
			map.entrySet().forEach(e ->
					System.out.println(e.getKey() + e.getValue()));
		
		//getOrDefault
			System.out.println("----- getOrDefault----");
			Map<Character, String> mapGD = new HashMap<>();
			mapGD.put('x', "spot");
			System.out.println("X marks the " + mapGD.get('x')); //x marks the spot
			System.out.println("X marks the " + mapGD.getOrDefault('x', "")); //x marks the spot
			System.out.println("Y marks the " + mapGD.get('y')); //Y marks the null
			System.out.println("Y marks the " + mapGD.getOrDefault('y', "")); //Y marks the (blank)
		
		//replace and replaceAll
			System.out.println("----- replace and replaceAll ----");
			Map<Integer, Integer> mapRA = new HashMap<>();
			mapRA.put(1, 2);
			mapRA.put(2, 4);
			Integer original = mapRA.replace(2, 10); // 4
			System.out.println(mapRA);    // {1=2, 2=10}
			mapRA.replaceAll((k, v) -> k + v);
			System.out.println(mapRA);    // {1=3, 2=12}
		
		//putIfAbsent
			System.out.println("----- putIfAbsent ----");
			Map<String, String> favorites = new HashMap<>();
			favorites.put("Jenny", "Bus Tour");
			favorites.put("Tom", null);
			favorites.putIfAbsent("Jenny", "Tram");
			favorites.putIfAbsent("Sam", "Tram");
			favorites.putIfAbsent("Tom", "Tram");
			System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
		
		//merge
			System.out.println("----- merge ----");
			BiFunction<String, String, String> mapper = (v1, v2) -> v1.length()> v2.length() ? v1: v2;
			
			Map<String, String> favorites2 = new HashMap<>();
			favorites2.put("Jenny", "Bus Tour");
			favorites2.put("Tom", "Tram");
			
			String jenny = favorites2.merge("Jenny", "Skyride", mapper);
			String tom = favorites2.merge("Tom", "Skyride", mapper);
			
			System.out.println(favorites2); // {Tom=Skyride, Jenny=Bus Tour}
			System.out.println(jenny);     // Bus Tour
			System.out.println(tom);       // Skyride
		
			BiFunction<String, String, String> mapper2 =
					(v1, v2) -> v1.length()> v2.length() ? v1 : v2;
			Map<String, String> favoritesWithNull = new HashMap<>();
			favoritesWithNull.put("Sam", null);
			favoritesWithNull.merge("Tom", "Skyride", mapper2);
			favoritesWithNull.merge("Sam", "Skyride", mapper2);
			System.out.println(favoritesWithNull);   // {Tom=Skyride, Sam=Skyride}
		
			BiFunction<String, String, String> mapper3 = (v1, v2) -> null;
			Map<String, String> favoritesPassNull = new HashMap<>();
			favoritesPassNull.put("Jenny", "Bus Tour");
			favoritesPassNull.put("Tom", "Bus Tour");
			favoritesPassNull.merge("Jenny", "Skyride", mapper3);
			favoritesPassNull.merge("Sam", "Skyride", mapper3);
			System.out.println(favoritesPassNull);   // {Tom=Bus Tour, Sam=Skyride} *
		
		//Check Table 3.8 behavior of the merge method
		
		
	}
}
