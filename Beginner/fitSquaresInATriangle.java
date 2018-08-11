import java.util.Scanner;

class fitSquaresInATriangle{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int T=input.nextInt();

		while(T-->0){
			int B=input.nextInt();
			
				int temp=B/2-1;
				int result=0;

				while(temp>0)
					result+=temp--;
				System.out.println(result);
			
		}
	}
}