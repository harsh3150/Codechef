import java.util.*;

class cutTheBoard{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int T=input.nextInt();
		while(T-->0){
			int M=input.nextInt();
			int N=input.nextInt();

			System.out.println((M-1)*(N-1));
		}
	}
}