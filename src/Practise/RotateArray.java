package Practise;

public class RotateArray {
	
	public static void main (String args[]){
		
		int a[] = {1,2,3,4,5,6,7};
		int numRotation = 2;
		//RotateArray ra = new RotateArray();
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		rotateArrayDivide(a,numRotation);		
	}
	
	public static void rotateArray(int a[], int k){
		
		int result[] = new int[a.length];
		
		if(k>a.length) {
			k=k%a.length;
		}
		
		for(int i=0; i<k; i++) {
			result[i] = a[a.length-k+i];
		}
		
		int j=0;
		for(int i=k; i<a.length; i++) {
			result[i] = a[j];
			j++;
		}
		
		System.out.println("Result Array");
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]);
		}
		
	}
	
	public static void rotateArrayDivide(int a[], int k) {
		if(k>a.length) {
			k=k%a.length;
		}
		
		int b = a.length - k;
		
		reverseArray(a, 0, b-1);
		reverseArray(a, b, a.length-1);
		reverseArray(a, 0, a.length-1);
		
		System.out.println();
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void reverseArray(int arr[], int left, int right) {
		if(arr==null || arr.length==1)
			return;
		while (left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
