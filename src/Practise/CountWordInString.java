package Practise;

import java.util.HashMap;

public class CountWordInString {

	public static void main(String[] args) {
		
		String s= "This is Ankur I know Ankur";
		String word = "Ankur";
		int num = findOccurances(s, word);
		System.out.println(num);

	}
	
	public static int findOccurances(String st, String find) {
		
		//HashMap<String, Integer> wordmap = new HashMap<String, Integer>();
		String[] sentence = st.split(" ");
		int count =0;
		for(String s: sentence){
			if(s.equals(find)){
				count++;
				//wordmap.put(s, wordmap.get(s)+1);
		}
		}
		return count;
	}

}
