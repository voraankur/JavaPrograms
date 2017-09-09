package Practise;

public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st= "AnkurVora";
		int vowels=0;
		int consonants = 0;
		//char[] vowel = {'a','e','i','o','u'};
		//char[] word = st.toLowerCase().toCharArray();
		for(int i=0;i<st.length();i++) {
			char c = st.charAt(i);
			if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
					c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				vowels++;
			} else {
				consonants++;
			}
			
		}		
		System.out.println("Vowels " +vowels);
		System.out.println("Consonants " +consonants);
	}

}
