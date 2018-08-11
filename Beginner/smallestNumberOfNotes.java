
import java.util.*;

class smallestNumberOfNotes{

	public static void main(String []args){
		Scanner input =new Scanner( System.in );

		int T=input.nextInt();

		while(T-->0){
			int totalAmount=input.nextInt();

			System.out.println(numberOfNotes(totalAmount));
		}
	}

	public static int numberOfNotes(int amount){
		int []note={100,50,10,5,2,1};
		int count=0;

		while(amount>0){
			for(int i=0;i<note.length;i++){
				int x=amount/note[i];
				if(x>0){
					count+=x;
					amount=amount%note[i];
				}
			}
		}

		return count;
	}
}


// Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.