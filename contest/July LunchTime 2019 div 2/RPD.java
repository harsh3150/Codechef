import java.util.*;

class RPD{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int t=input.nextInt();

		while(t-->0){
			int n=input.nextInt();

			int arr[]=new int[n];

			for(int i=0;i<n;i++)
				arr[i]=input.nextInt();

			int maxSum=0;

			for(int i=0;i<n;i++){
				for(int j=i+1 ;j<n;j++){

					int product=arr[i]*arr[j];
					String temp=product+"";
					int len=temp.length();
					int sum=0;
					for(int x=0;x<len;x++){
						sum+=(int)temp.charAt(x)-48;
					}
					

					if(sum>maxSum)
						maxSum=sum;
				}
			}

			System.out.println(maxSum);
		}
	}
}