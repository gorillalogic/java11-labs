package chapter7.pond.swan;

import chapter7.pond.shore.Bird;

public class Swan extends Bird {
	public void swim() {
		floatInWater();
		System.out.println(text);
	}
	public void helpSwanBirdSwim() {
		Swan other = new Swan();
		other.floatInWater();
		System.out.println(other.text);
	}
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		//other.floatInWater();  //Does not compile
		//System.out.println(other.text); //Does not compile
		
		//Swan has access to Bird since it extends it as inheritance but the reference used inside the method of helpOtherBirdSwim doesn't
	}
}
