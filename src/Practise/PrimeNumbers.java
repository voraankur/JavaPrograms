package Practise;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2; i<100; i++) {
			int counter = 0;
			for(int j=i-1; j>1; j--) {
				if(i%j ==0) {
					counter++;
				}
			}
			if(counter==0) {
				System.out.print(i + " ");
			}
		}

	}

}
