package Practise;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range[] = {1,3,4,5,6};
		int counter = range[0];
		for(int i=0; i<range.length; i++) {
			if(counter==range[i]) {
				counter++;
			} else {
				System.out.println("Missing Number " + counter);
				break;
			}
		}
	}

}
