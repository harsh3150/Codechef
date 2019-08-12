//accepted

/*
author: harsh3150

qustion:  Distribute Apples
*/

import java.util.Scanner;


class DSTAPLS{
	public static void main(String[] args) {
		Scanner input_scan=new Scanner(System.in);

		int t=input_scan.nextInt();

		while(t-->0){
			long n=input_scan.nextLong();
			long k=input_scan.nextLong();

			if(n/k%k==0)
				System.out.println("NO");
			else System.out.println("YES");

		}

	}

}
