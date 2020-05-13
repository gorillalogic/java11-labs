package chapter8.animal;

public class Lion extends Animal {
	public void setProperties(int age, String n) {
		setAge(age);
		name = n;
	}

	public void roar() {
		System.out.print(name + ", age  " + getAge() + ", says: Roar!"); 
		// Variable age is marked as private, so it can be accessed indirectly through the getAge() and setAge(). 
	}

	public static void main(String[] args) {
		var lion = new Lion();
		lion.setProperties(3, "Kion");
		lion.roar();
	}
}
