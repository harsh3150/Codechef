//accepted

/*
author: harsh3150

qustion: football
*/

import java.util.Scanner;


public class MSNSADM1{
	public static void main(String[] args) {
		Scanner input_scan=new Scanner(System.in);

		int t=input_scan.nextInt();

		while(t-->0){
			int n=input_scan.nextInt();

			int score[]=new int [n];
			int foul[]=new int [n];

			for(int i=0;i<n;i++)
				score[i]=input_scan.nextInt();


			for(int i=0;i<n;i++)
				foul[i]=input_scan.nextInt();


			int max=0;

			for(int i=0;i<n;i++){
				int points=score[i]*20-foul[i]*10;
				if(max<points)
					max=points;

			}
			System.out.println(max);
		}
	}
}