package chapter8.duck;

public class Duck {
	private String color;
	private int height;
	private int length;

	public void setData(int length, int theHeight) {
		length = this.length; // Backwards  no good and be careful on the exam
		height = theHeight; // ok, different name
		this.color = "white"; // ok, this not necessary
	}

	public static void main(String[] args) {
		Duck b = new Duck();
		b.setData(1, 2);
		System.out.print(b.length + " " + b.height + " " + b.color);
	}
}
	