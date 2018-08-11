
import java.util.Scanner;
 class goodJoke{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test-->0){
            int result = 0;
          int n = scan.nextInt();
          for(int i=1;i<=n;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
                result = result^i;
          }
          System.out.println(result);
        }
        scan.close(); 
    }
} 