package Practise;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "KAYAK";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		
		System.out.println("Reverse String is "+sb.toString());
		if(sb.toString().equals(s)) {
			System.out.println("Its Palindrom");
		} else {
			System.out.println("Its not Palindrom");
		}

	}

}
