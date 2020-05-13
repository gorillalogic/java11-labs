package chapter8;

class Mammal {
	String type = "Mamal";
}
public class Bat extends Mammal {
	String type = "bat";
	public String getType() {
		return super.type + ":" + this.type;
		//If we removed the super it will print bat:bat, because Java uses the narrowest scope it can.
	}
	public static void main(String... zoo) {
		System.out.print(new Bat().getType());
	}
}
