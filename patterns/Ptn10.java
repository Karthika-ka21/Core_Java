 // X shape
 import java.util.Scanner;
 class Ptn10 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i||i+j==n+1){
                    System.out.print("* "); 
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
