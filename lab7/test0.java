
public class test0 {
	public static void main(String[] args) {
		TestSub sub1= new TestSub();
		TestSuper super1 = new TestSub();
		System.out.println(sub1.getS());
		System.out.println(sub1.s);
		System.out.println(super1.getS());
		System.out.println(super1.s);
	}
	
}
