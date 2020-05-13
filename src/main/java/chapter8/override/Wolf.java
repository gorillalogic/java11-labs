package chapter8.override;

class Canine {
	public double getAverageWeight() {
		return 50;
	}
}

public class Wolf extends Canine {
	public double getAverageWeight() {
		return super.getAverageWeight() + 20;
	}

	public static void main(String[] args) {
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
	}
}

//Note: In the above example, the super keyword was needed to call the parent method. 
//If we removed that that would call itself, doing a recursive call.
//public double getAverageWeight() {
//	return getAverageWeight() + 20;  //StackOverflowError at runtime
//}