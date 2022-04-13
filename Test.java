package accessmodifiers;

public class Test {
     private int a=12;
             int b=34;
     protected int c=45;
     public int d=99;
	public static void main(String[] args) {
		Test tobject=new Test();
		System.out.println(tobject.a);
		System.out.println(tobject.b);
		System.out.println(tobject.c);
		System.out.println(tobject.d);
		

	}

}
