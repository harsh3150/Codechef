import java.util.*;

class versionControlSystem{

	public static void main(String []args){
		Scanner input =new Scanner( System.in );

		byte T=input.nextByte();

		while(T-->0){
			//input
			int N=input.nextInt();
			int M=input.nextInt();
			int K=input.nextInt();

			int []mA=new int[M];
			int []kB=new int[K];

			for(int i=0 ; i<M ; i++)
				mA[i]=input.nextInt();


			for(int i=0 ; i<K ; i++)
				kB[i]=input.nextInt();

			//output
			solution(N,mA,kB);
		}
	}

	public static void solution(int N, int[]mA, int []kB){
		int tracked_and_ignored=0,untracked_and_unignored=0;

		for(int i=1;i<=N;i++){
			int track=0;
			for(int j=0;j<mA.length;j++)
				if(mA[j]==i)
					track=1;
			for(int j=0;j<kB.length;j++)
				if(kB[j]==i)
					track=1;

			if(track==0)
				untracked_and_unignored++;
		}


		for(int i=0;i<mA.length;i++){
			int track=0;
			for(int j=0;j<kB.length;j++)
				if(mA[i]==kB[j])
					track=1;

			if(track==1)
				tracked_and_ignored++;
			
		}

		System.out.println(tracked_and_ignored+" "+untracked_and_unignored);
	}
}


















