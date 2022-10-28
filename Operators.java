
public class Operators {

	public static void main(String[] args) {
	//Unary Operator Post
		int a=10;  
		int b=10; 
		int c=20;
		int d=5;
		System.out.println(a++ + ++a);  
		System.out.println(b++ + b++);
		 //unary operator pre
		boolean e=true;  
		boolean f=false;  
		System.out.println(~a);  
		System.out.println(~b);  
		System.out.println(!e);  
		System.out.println(!f);
		
		
		//Arithmetic Operators
		System.out.println(a+b);  
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b);  
		
		
		//Shift Operator
		System.out.println(10<<2);
		System.out.println(10>>2);
		
		//Logical && and Bitwise &
		System.out.println(a<b&&a<c);  
		System.out.println(a<b&a<c);/
		System.out.println(a>b||a<c);
		System.out.println(a>b||a++<c);
		
		
		//Assignment Operator\
		a+=4;
		System.out.println(a);  
		b-=4;
		System.out.println(b);  
		c*=4;
		System.out.println(c);  
		d/=5;
		System.out.println(d);  
		

	}

}
