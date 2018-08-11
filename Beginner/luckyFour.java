import java.util.*;

class luckyFour{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int T=input.nextInt();

		while(T-->0){
			int number=input.nextInt();

			int count=0;
			
			while(number>0){
				int result=number%10;
				if(result==4)
					count++;
				
				number/=10;

			}
			System.out.println(count);
		}
	}
}