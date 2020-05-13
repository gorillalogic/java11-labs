package chapter8.constructors;

//public class MouseHouse {
//	private final int volume;
//	private String name = "The Mouse House";
//	{
//		volume = 10;
//	}
//}

//public class MouseHouse {
//	private final int volume;
//	private final String type;
//	public MouseHouse() {
//		this.volume = 10;
//		type = "happy";
//	}
//}

//The following class will failed:
//public class MouseHouse {
//	private final int volume;
//	private final String type;
//	{
//		this.volume = 10;
//	}
//	public MouseHouse(String type) {
//		this.type = type;
//	}
//	public MouseHouse() {		//this reports the error because the constructor never sets a value for type
//		this.volume = 2;		//it sets a value for the volume variable, even though it was already assigned.
//	}
//}
//Each constructor is considered independently in terms of assignment.
//Be careful when using final instance variables and also when a constructor calls another one,
//make sure all final variables are assigned a value just one time.
