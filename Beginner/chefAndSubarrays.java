import java.util.*;

class chefAndSubarrays{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int T=input.nextInt();

		while(T-->0){
			int n=input.nextInt();

			int []array=new int[n];
			for(int i=0;i<n;i++)
				array[i]=input.nextInt();

			System.out.println(answer(array));

		}		
	}

	public static int answer(int []array){
		int count=0;

		for(int i=0;i<array.length;i++){
			int sum=0,product=1;
			for(int j=i;j<array.length;j++){
				sum=sum+array[j];
				product=product*array[j];

				if(sum==product)
					count++;
			}
		}
		return count;
	}	
}