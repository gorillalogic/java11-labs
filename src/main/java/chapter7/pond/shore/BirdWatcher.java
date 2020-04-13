package chapter7.pond.shore;

public class BirdWatcher {
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater(); //calling protected member
		System.out.println(bird.text); //accessing protected member
	}
}
