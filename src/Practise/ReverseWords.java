package Practise;

public class ReverseWords {

	public static void main(String[] args) {
		String st= "The sky is blue";
		char s[]= st.toCharArray();
		for (int i=0; i<s.length; i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		reverseWords(s);
		System.out.println("New");
		for (int i=0; i<s.length; i++) {
			System.out.print(s[i]);
		}

	}
	
	public static void reverseWords(char s[]) {
		int i=0;
		for(int j=0; j<s.length; j++){
			if(s[j] == ' ') {
				reverseArray(s, i, j-1);
				i=j+1;
			}
		}
		
		reverseArray(s, i, s.length-1);
		reverseArray(s, 0, s.length-1);
	}
	
	public static void reverseArray(char arr[], int left, int right) {
		while (left<right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
