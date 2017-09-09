package Practise;

public class StaticVariable {
	
	public static void main(String args[]){
		
		StaticClass s = new StaticClass();
		StaticClass s2 = new StaticClass();
		s2.i=15;
		s2.j=20;
		System.out.println(s.i);
		System.out.println(s.j);
		System.out.println(s2.i);
		System.out.println(s2.j);
		
		String a = "Ankur";
		String b = "Ankur";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}

}

class StaticClass {
	static int i=10;
	int j=5;
	
	public StaticClass() {
		
	}
}
