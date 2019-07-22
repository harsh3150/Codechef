//was not accepted 

import java.util.*;

import java.math.*;

 class BDGFT{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int t=input.nextInt();
		while(t-->0){
			int ans=0;
			String s=input.next();
			String temp="";
			int n=s.length();
			for (int i = 0; i < n; i++)  
	           for (int j = i+2; j <= n; j++) {

	           		temp=s.substring(i,j);
	           		long count_0=0,count_1=0;
	           		int temp_len=temp.length();
	           		
	           		for(int x=0;x<temp_len;x++){
	           			if(temp.charAt(x)=='0')
	           				count_0++;
	           			else 
	           				count_1++;
	           		}

	           		if(count_0==count_1*count_1)
	           			ans++;
				

	           }

	         System.out.println(ans);
		

		}

	}
}


		
