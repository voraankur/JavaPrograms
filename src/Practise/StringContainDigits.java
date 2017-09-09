package Practise;

public class StringContainDigits {

	public static void main(String[] args) {
		
		String st="123AA4";
		Boolean isDigit = true;
		for(int i=0; i<st.length(); i++) {
			if(!Character.isDigit(st.charAt(i))) {
				isDigit =false;
				break;
			}
		}
		
		if(isDigit) {
			System.out.println("Only Digits");
		} else {
			System.out.println("Not Only Digits");
		}

	}

}
