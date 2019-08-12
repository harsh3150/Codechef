//partial accepted(for 30 points)

/*
author: harsh3150
question: Zombie and the Caves

*/

import java.util.Scanner;
import java.util.Arrays;

class ZOMCAV{
	public static void main(String[] args) {
		Scanner input_scan=new Scanner (System.in);

		int t=input_scan.nextInt();

		while(t-->0){
			int n=input_scan.nextInt();

			int caves[]=new int[n];
			int health[]=new int[n];
			int radiation[]=new int[n];

			for(int i=0;i<n;i++)
				caves[i]=input_scan.nextInt();

			for(int i=0;i<n;i++)
				health[i]=input_scan.nextInt();

			for(int i=0;i<n;i++){
				int low=i+1-caves[i];
				int high=i+1+caves[i];
				if(low<1)
					low=1;
				else if(low>n)
					low=n;
				if(high>n)
					high=n;

				for(;low<=high;low++)
					radiation[low-1]++;

			}

			// System.out.println(Arrays.toString(radiation));
			// Arrays.sort(radiation);
			// System.out.println(Arrays.toString(radiation));

			boolean check=true;
			for(int i=0;i<n;i++){
				int index=search(radiation,health[i],n);
			// System.out.println(index);

				if(index>=0){
					radiation[index]=0;
				}
				else{
					check=false;
					break;
				}
			// System.out.println(Arrays.toString(radiation));

			}

			if(check)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

	static int search(int []arr, int key, int len){
		for(int i=0;i<len;i++)
			if(arr[i]==key)
				return i;
		return -1;
	}
}
