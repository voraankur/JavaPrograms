package Practise;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm1 = new HashMap<>();
		HashMap<String, String> hm2 = new HashMap<>();
		
		hm1.put("Ankur", "Kutchi");
		hm1.put("Jiyan", "Kutchi");
		hm1.put("Mayur", "Marathi");
		hm1.put("Ankit", "Marvadi");
		
		hm2.put("Ankur", "Smart");
		hm2.put("Krutika", "Gawar");
		hm2.put("Kinjal", "Chaman");
		hm2.put("Ankit", "Tharki");
		
		ArrayList<String> common = new ArrayList<>(); 
		
		for(String s: hm1.keySet()) {
			if(hm2.containsKey(s)) {
				common.add(s);
			}
		}
		
		for(int i=0; i<common.size(); i++) {
			System.out.println(common.get(i));
		}
	}

}
