//inverted triangle
import java.util.Scanner;
class Ptn14 { 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int stars=(2*n)-1,spaces=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<spaces;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            stars=stars-2;
            spaces++;
            System.out.println();
        
    }
}
}
