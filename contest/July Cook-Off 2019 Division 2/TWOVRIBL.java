//accepted
import java.util.*;

import java.math.*;

 class TWOVRIBL{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int t=input.nextInt();
		while(t-->0){
			int ans=0;
			int n=input.nextInt();
			long x=0,y=0;

			while(x<=n){

				if(x*x>y){
					y+=x*x;

					ans++;
				}
				x=1+((long)Math.sqrt(y));
			}

			System.out.println(ans);
		}

	}

}
