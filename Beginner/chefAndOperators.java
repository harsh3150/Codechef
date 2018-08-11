
import java.util.Scanner;
 class chefAndOperators{
 	public static void main(String[] args) {
 		Scanner input =new Scanner (System.in);

 		int T=input.nextInt();

 		while(T-->0){
 			int A=input.nextInt();
 			int B=input.nextInt();

 			if(A>B)
 				System.out.println(">");
 			else if(A<B)
 				System.out.println("<");
 			else
 				System.out.println("=");
 		}
 	}
 }