import java.util.*;

class cielAndReceipt{

	public static void main(String []args){
		Scanner input =new Scanner( System.in );

		byte T=input.nextByte();

		while(T-->0){
			int p=input.nextInt();

			System.out.println(numberOfMenu(p));
		}
	}

	public static int numberOfMenu(int p){
		int []menu={2048,1024,512,256,128,64,32,16,8,4,2,1};
		int count=0;

		while(p>0){
			for(int i=0;i<menu.length;i++){
				int x=p/menu[i];
				if(x>0){
					count+=x;
					p=p%menu[i];
				}
			}
		}

		return count;
	}


}

