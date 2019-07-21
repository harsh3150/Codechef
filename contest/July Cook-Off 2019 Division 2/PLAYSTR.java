//accepted

import java.util.*;

import java.math.*;

 class PLAYSTR{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int t=input.nextInt();
		while(t-->0){
		int n=input.nextInt();
		String s=input.next();
		String r=input.next();

		int t1=0;
		int t2=0;

		for(int i=0;i<n;i++){
			if(s.charAt(i)=='1')
				t1++;
			if(r.charAt(i)=='1')
				t2++;
		}

		if(t1==t2){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");

		}


		}

	}

}

		