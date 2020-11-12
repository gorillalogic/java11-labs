package exam816.chapter3.diamondOperator3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diamond {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		List<Integer> list2 = new ArrayList<>();
		Map<String,Integer> map2 = new HashMap<>();
		Map<Long,List<Integer>> mapOfLists = new HashMap<>();
		
		//List<> list3 = new ArrayList<Integer>();      // DOES NOT COMPILE
		//Map<> map3 = new HashMap<String, Integer>();  // DOES NOT COMPILE
		
		
		var listFinal1 = new ArrayList<Integer>();
		var listFinal2 = new ArrayList<>();
		
		listFinal1.add(1);
		listFinal2.add("1");
		
		System.out.println(listFinal1.get(0).getClass());
		System.out.println(listFinal2.get(0).getClass());
		
	}
	
	class InvalidUse {
		//void use(List<> data) {}                  // DOES NOT COMPILE
	}
	
	
}
