import java.util.*;

class chefAndTwoStrings{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int T=input.nextInt();

		while(T-->0){
			String S1=input.next();

			String S2=input.next();

			answer(S1,S2);
		}
	}

	public static void answer(String S1,String S2){
		int similar=0,nonSimilar=0,noOfBlanks=0;			

			for(int i=0;i<S1.length();i++){
				if(S1.charAt(i)=='?'||S2.charAt(i)=='?')
					noOfBlanks++;
				else if(S1.charAt(i)==S2.charAt(i) )
					similar++;
				else 
					nonSimilar++;
			}
			if(nonSimilar==0)
				System.out.println("0 "+noOfBlanks);
			else 
				System.out.println(nonSimilar+" "+(nonSimilar + noOfBlanks));
	}
}


// Input:
// 3
// a?c
// ??b
// ???a
// ???a
// ?abac
// aba?w

// Output:
// 1 3
// 0 3
// 3 5