import java.util.*;

class puppyAndSum{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int T=input.nextInt();
		while(T-->0){
			int x=input.nextInt();
			int y=input.nextInt();

			System.out.println(sum(x,y));
		}
	}

	public static int sum(int D, int N){
		int ans=0;
		for(int i=1;i<=D;i++){
			int sum=0;

			for(int j=1;j<=N;j++)
				sum+=j;
			N=sum;

			ans=sum;

		}
		return ans;
	}
}