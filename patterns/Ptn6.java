import java.util.Scanner;
class Ptn6{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                for(int j=1;j<=n+2;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n+2;j++){
                    if(i+j<=n||i+j>=2*i+3)
                        System.out.print("*"+" ");
                    else
                        System.out.print(" "+" ");
                }
                System.out.println();
            }
        }
    }
}
