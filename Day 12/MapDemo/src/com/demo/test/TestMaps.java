package com.demo.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMaps {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		hm.put("DAC", 600);
		hm.put("DBDA",500);
		hm.put("DTISS", 500);
		//to get duration of DAC,retrieve value based on key
		hm.get("DAC");
		//check whether key exists
		System.out.println(hm.containsKey("DAC"));
		//if key exists,it overwrites the value
		hm.put("DAC", 750);
		//since key doesnot exists, it will get added
		hm.put("DVLSI", 450);
	    //to find keys based on values
		Set<String> cset=hm.keySet();
		System.out.println("------------------------------");
		for(String k:cset) {
			System.out.println(k+"-----"+ hm.get(k));
			//to print the keys based on value
			
			if(hm.get(k)==500) {
				System.out.println(k);
			}
		}
		//using entryset
		System.out.println("------------------------------");
		Set<Map.Entry<String,Integer>> es=hm.entrySet();
		for(Map.Entry<String,Integer> m:es) {
			System.out.println(m.getKey()+"----"+m.getValue());
		}
        
	}

}
