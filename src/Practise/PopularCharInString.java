package Practise;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PopularCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ankurvora";
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<a.length(); i++) {
			if(hm.containsKey(a.charAt(i))) {
				hm.put(a.charAt(i), hm.get(a.charAt(i))+1);
			}
			else {
				hm.put(a.charAt(i), 1);
			}
		}
		int max = 0;
		char popular=0;
		ArrayList<Character> list = new ArrayList<>();
		for(char c: hm.keySet()){
			if(hm.get(c) >= max) {
				if(hm.get(c)==max) {
					
				}
				max = hm.get(c);
				popular = c;
			}
		}
		
		System.out.println("Most Popular Character is " + String.valueOf(popular));

	}

}
