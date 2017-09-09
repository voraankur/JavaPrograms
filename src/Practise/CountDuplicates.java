package Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] orig = {1,3,4,6,3,2,1,1};
		Map<Integer,Integer> arraymap = new HashMap<>();
		
		for(int i=0;i<orig.length;i++) {
			if(arraymap.containsKey(orig[i])){
				arraymap.put(orig[i], arraymap.get(orig[i])+1);
			} else {
				arraymap.put(orig[i],1);
			}
		}
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i: arraymap.keySet()) {
			newList.add(i);
			if(arraymap.get(i)>1) {
			System.out.println("Value : " + i + " Number of occurances: "+arraymap.get(i));
			}
		}
		
		for(int i=0;i<newList.size();i++) {
			System.out.print(newList.get(i) + " ");
		}
	}
}
