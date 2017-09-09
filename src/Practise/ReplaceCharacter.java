package Practise;

public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st= "Ankur Vora";
		char word[] = st.toLowerCase().toCharArray();
		
		for(int i=0; i<word.length; i++){
			if(word[i]==' ') {
				word[i]='1';
			}
		}
		System.out.println(String.valueOf(word));/*
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]);
		}*/

	}

}
