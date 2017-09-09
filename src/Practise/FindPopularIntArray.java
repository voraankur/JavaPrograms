package Practise;

import java.util.Arrays;

public class FindPopularIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,2,4,1,2,2,2,1};
		
		Arrays.sort(a);
		
		 int previous = a[0];
		 int popular = a[0];
		 int count = 1;
		 int maxCount = 1;

		    for (int i = 1; i < a.length; i++) {
		        if (a[i] == previous)
		            count++;
		        else {
		            if (count > maxCount) {
		                popular = a[i-1];
		                maxCount = count;
		            }
		            previous = a[i];
		            count = 1;
		        }
		    }
		
		    popular = count > maxCount ? a[a.length-1] : popular;
		    System.out.println(popular);

	}

}
