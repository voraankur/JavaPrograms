package Practise;


public class CountZerosAndOnes {
	public static void main (String args[]) {
		int a[] = {0,1,1,1,0,0,0,0};
		//ArrayList<Integer> b = new ArrayList<>();
		int count0 = 0, count1=0;
		for (int i=0; i< a.length; i++) {
			if(a[i]==0) {
				count0++;
			}
			if(a[i]==1) {
				count1++;
			}			
		}
		System.out.println("Zeros"+ count0);
		System.out.println("Ones"+ count1);
		for(int i=0; i<count0; i++) {
			a[i] = 0;
		}
		for(int i=count0; i<a.length; i++) {
			a[i] = 1;
		}
		for(int i=0; i<a.length; i++){
		System.out.print(a[i] + "  ");
		}
	}
}
