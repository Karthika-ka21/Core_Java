 import java.util.Scanner;
class Ptn7{
    public static void main(String[] args){
        int n,stars=1,spaces=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n=sc.nextInt();
        int str=n-2;
        for(int i=1;i<=n;i++){ 
           if(i<=(n/2)){
            for(int j=1;j<=((n/2)+1)-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            stars+=2;
            System.out.println();
           }
           else if(i==(n/2)+1){
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
           }
           else{
             
                for(int j=1;j<=spaces;j++){
                    System.out.print(" "+" ");
                }
                for(int j=1;j<=str;j++){
                    System.out.print("*"+" ");
                }
                spaces++;
                str-=2;
                System.out.println();
           }
        }
}
}