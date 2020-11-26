package exam816.chapter3.sortingData5;

import java.util.*;

public class Duck implements Comparable<Duck> {
	private String name;
	public Duck(String name) {
		this.name = name;
	}
	public String toString() { // use readable output
		return name;
	}
	public int compareTo(Duck d) {
		return name.compareTo(d.name); // sorts ascendingly by name
	}
	
	//compareTo Rules:
	// Return 0: Objects are equivalent
	// Return -: Current object < argument to compare
	// Return +: Current object > argument to compare
	
	
	public static void main(String[] args) {
		var ducks = new ArrayList<Duck>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		Collections.sort(ducks);   // sort by name
		System.out.println(ducks); // [Puddles, Quack]
		
	}
}


class Animal implements Comparable<Animal> {
	private int id;
	
	public int compareTo(Animal a) {
		return id - a.id; // sorts ascending by id
		//return Integer.compare(id, a.id);
	}
	
	public static void main(String[] args) {
		var a1 = new Animal();
		var a2 = new Animal();
		a1.id = 5;
		a2.id = 7;
		System.out.println(a1.compareTo(a2)); // -2
		System.out.println(a1.compareTo(a1)); // 0
		System.out.println(a2.compareTo(a1)); // 2
	}
}

//Casting the compareTo() Argument
class LegacyDuck implements Comparable {
	private String name;
	public int compareTo(Object obj) {
		LegacyDuck d = (LegacyDuck) obj; // cast because no generics
		return name.compareTo(d.name);
	}
}

//Checking for null
class MissingDuck implements Comparable<MissingDuck> {
	private String name;
	public int compareTo(MissingDuck quack) {
		if (quack == null)
			throw new IllegalArgumentException("Poorly formed duck!");
		if (this.name == null && quack.name == null)
			return 0;
		else if (this.name == null) return -1;
		else if (quack.name == null) return 1;
		else return name.compareTo(quack.name);
	}
}

//Keeping compareTo() and equals() Consistent
//consistent with equals if, and only if, x.equals(y) is true whenever x.compareTo(y) equals 0.

class Product implements Comparable<Product> {
	private int id;
	private String name;
	
	public int hashCode() { return id; }
	public boolean equals(Object obj) {
		if(!(obj instanceof Product)) return false;
		var other = (Product) obj;
		return this.id == other.id;
	}
	public int compareTo(Product obj) {
		return this.name.compareTo(obj.name);
	}
}

//Comparing Data with a Comparator
class Duckling implements Comparable<Duckling> {
	private String name;
	private int weight;
	
	public Duckling(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(Duckling d) {
		return name.compareTo(d.name);
	}
	
	public static void main(String[] args) {
		Comparator<Duckling> byWeight = new Comparator<Duckling>() {
			public int compare(Duckling d1, Duckling d2) {
				return d1.getWeight() - d2.getWeight();
			}
		};
		
		Comparator<Duckling> byWeight2 = (d1, d2) -> d1.getWeight()-d2.getWeight();
		
		Comparator<Duckling> byWeight3 = Comparator.comparingInt(Duckling::getWeight);
		
		var ducks = new ArrayList<Duckling>();
		ducks.add(new Duckling("Quack", 7));
		ducks.add(new Duckling("Puddles", 10));
		Collections.sort(ducks);
		System.out.println(ducks); // [Puddles, Quack]
		Collections.sort(ducks, byWeight);
		System.out.println(ducks); // [Quack, Puddles]
	}
	
}

//Comparing Comparable and Comparator
//Check table 3.11

//Comparing Multiple Fields

class Squirrel {
	private int weight;
	private String species;
	
	public Squirrel(int weight, String species) {
		this.weight = weight;
		this.species = species;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public class MultiFieldComparator implements Comparator<Squirrel> {
		public int compare(Squirrel s1, Squirrel s2) {
			int result = s1.getSpecies().compareTo(s2.getSpecies());
			if (result != 0) return result;
			return s1.getWeight() - s2.getWeight();
		}
	}
	
	Comparator<Squirrel> c2 = Comparator.comparing(Squirrel::getSpecies)
			.thenComparingInt(Squirrel::getWeight);
	
	//Descending Order
	Comparator<Squirrel> c3 = Comparator.comparing(Squirrel::getSpecies).reversed();
	
	//Check Table 3.12 Helper static methods for building a comparator
	//Check Helper default methods for building a Comparator
}

//Sorting And Searching

class SortRabbits {
	static class Rabbit {
		int id;
	}
	
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		//Collections.sort(rabbits); // DOES NOT COMPILE
		
		Comparator<Rabbit> c = Comparator.comparingInt(r -> r.id);
		Collections.sort(rabbits, c);
		
		
		//*BinarySearch
		List<Integer> list = Arrays.asList(6, 9, 1, 8);
		Collections.sort(list); // [1, 6, 8, 9]
		System.out.println(Collections.binarySearch(list, 6)); // 1
		System.out.println(Collections.binarySearch(list, 3)); // -2
		
		var names = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> c2 = Comparator.reverseOrder();
		var index = Collections.binarySearch(names, "Hoppy", c2);
		System.out.println(index);
	}
}

class UseTreeSet {
	static class Rabbit {
		int id;
	}
	
	public static void main(String[] args) {
		Set<Duck> ducks = new TreeSet<>();
		ducks.add(new Duck("Puddles"));
		
		//Set<Rabbit> rabbits = new TreeSet<>();
		Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id-r2.id);
		rabbits.add(new Rabbit());  // ClassCastException
		
		//Exception in thread "main" java.lang.ClassCastException:
		//class Duck cannot be cast to class java.lang.Comparable
		
	}
}




