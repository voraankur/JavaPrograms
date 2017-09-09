package Practise;

public class FindWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = " Ankur Vora ";
		String st1 = "";
		int counter = 0;
		
		for(int i=0; i<st1.length(); i++) {
			
			if(st1.charAt(i) != ' ' && st1.charAt(i+1) == ' ') {
				counter++;
			}
		}

		System.out.println("The number of words are " + (counter+1));
	}

}
