import java.util.Scanner;
class Ptn5
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n=sc.nextInt();
        int spaces=n-1,stars=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                if(j==1 || j==stars || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            spaces--;
            stars+=2;

        }
    }
}