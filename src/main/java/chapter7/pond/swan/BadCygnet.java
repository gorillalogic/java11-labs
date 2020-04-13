package chapter7.pond.swan;

import chapter7.pond.duck.MotherDuck;

public class BadCygnet {
	public void makeNoise(){
		MotherDuck duck = new MotherDuck();
		//duck.quack();                           //Does not compile
		//System.out.println(duck.noise);         //Does not compile
	}
}

