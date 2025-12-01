//hour glass pattern with Star
import java.util.Scanner;
class Ptn13
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int stars=n;
        for(int i=1;i<=n;i++)
        {
           if(i<(n/2)+1){
            for(int j=0;j<i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=stars;j>0;j--){
                System.out.print("*"+" ");
            }
            stars=stars-2;
            System.out.println();
           }
           else if(i==(n/2)+1){
            for(int j=n/2;j>0;j--){
                System.out.print(" "+" ");
            }
            System.out.print("*"+" ");
            System.out.println();
           }
           else{
            stars=stars+2;
            for(int j=n-i;j>0;j--){
                System.out.print(" "+" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
           }
        }
        
        }
}
