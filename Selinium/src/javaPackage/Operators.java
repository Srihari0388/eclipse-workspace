public class Operators{
	public static void main(String args[]){
	int a=10;
	System.out.println(++a + a++ + a++);
	System.out.println(a);
	
	a=20;
	System.out.println(--a + a++ + a--);
	// --a -> 19 -> 19
	// a++ -> 20 ->21
	// a-- -> 19 ->19

	}
}