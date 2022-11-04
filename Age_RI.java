import java.util.Scanner;
public class Age_RI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		char gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		age=sc.nextInt();
		if(age>=60) {
			System.out.println("Enter Your gender i.e write m or f");
			gender=sc.next().charAt(0);
			if(gender=='m'|| gender=='M' ) {
				System.out.println("Rate Of Intrest(RI)= 7% ");
				
			}
			else if(gender=='f'|| gender=='M') {
				System.out.println("Rate Of Intrest(RI)= 7.5% ");
			}
			else {
				System.out.println("enter valid information ");
			}
				
		}
		else if(age<60) {
			System.out.println("Rate Of Intrest(RI)= 5% ");
		}
		else {
			System.out.println("enter age valid information");
		}
	}

}
