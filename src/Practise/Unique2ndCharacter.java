package Practise;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Unique2ndCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st= "Krutika";
		char[] charArray = st.toLowerCase().toCharArray();
		int position = 0;
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		for(Character c: charArray) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			} else {
				hm.put(c, 1);
			}
		}
		
		for(char c : hm.keySet()) {
			if(hm.get(c)==1) {
				position++;
				if(position == 1) {
					System.out.println("Key " + c + " Value " + hm.get(c));
					break;
				}
			}
		}

	}

}
