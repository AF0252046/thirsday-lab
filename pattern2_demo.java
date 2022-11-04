
public class pattern2_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
