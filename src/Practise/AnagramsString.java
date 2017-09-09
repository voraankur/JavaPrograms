package Practise;

import java.util.HashMap;

public class AnagramsString {

	public static void main(String[] args) {
		String a = "Test";
		String b = "TEST";
		
		char[] word1 = a.toLowerCase().toCharArray();
		char[] word2 = b.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char c: word1) {
			int count = 1;
			if(hm.containsKey(c)) {
				count= hm.get(c)+1;
			}
			hm.put(c, count);
		}
		
		for(char c: word2) {
			int count = -1;
			if(hm.containsKey(c)) {
				count=hm.get(c)-1;
			}
			hm.put(c, count);
		}
		
		
		
		boolean anagram = true;
		for(char c:hm.keySet()){
			if(hm.get(c)!=0) {
				anagram= false;
			}
		}

		if(anagram==true) {
			System.out.println("Two Strings are Anagram");
		} else {
			System.out.println("Two Strings are not Anagram");
		}
	}

}
