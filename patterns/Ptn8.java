import java.util.Scanner;
class Ptn8{
    public static void main(String[] args) {
        int stars=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int spaces=n-2;
        for(int i=1;i<=n;i++){
            if(i==n/2+1){
                for(int j=1;j<=n;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
                
            }
            else{
                
            for(int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
               System.out.println();
                if(i<n/2){
                stars++;
                spaces-=2;
                }else if(i==n/2){
                    continue;
                }
                else{
                stars--;
                spaces+=2;
                }
            }
        }


    }
}