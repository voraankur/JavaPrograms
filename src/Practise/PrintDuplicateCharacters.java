package Practise;

import java.util.HashMap;

public class PrintDuplicateCharacters {
	
	public static void main(String args[]) {
		String s= "ankurVora";
		HashMap<Character, Integer> hm = new HashMap<>();
		
//		for(char c:hm.keySet()) {
//			if(hm.containsKey(c)) {
//				hm.put(c, hm.get(c)+1);
//			}
//			else {
//				hm.put(c, 1);
//			}
//		}
		
		for(int i=0; i<s.length(); i++) {
			if(hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		
		for(char c: hm.keySet()) {
			if(hm.get(c)>1) {
			String key =c+"";
            int value = hm.get(c);  
            System.out.println(key + " " + value);
			}
		}
		
	}
}
