//accepted

/*
author: harsh3150

qustion: Dilemma
*/

import java.util.Scanner;


class CHEFDIL{
	public static void main(String[] args) {
		Scanner input_scan=new Scanner(System.in);

		int t=input_scan.nextInt();

		while(t-->0){
			int num=0;
			StringBuilder n=new StringBuilder(input_scan.next());
			int lengthOfGivenString=n.length();

			for(int i=0;i<lengthOfGivenString;i++){
				int current=(int)n.charAt(i) -48;
				
				num=current==1?num+1:num;

			}

			System.out.println(num%2==0?"LOSE":"WIN");

		}

	}

}
