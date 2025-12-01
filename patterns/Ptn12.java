 import java.util.Scanner;
 class Ptn12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the middle value");
        int n=sc.nextInt();
        int limit=(2*n)-1;
        for(int i=1;i<=limit;i++){
            for(int k=1;k<=n;k++){
                if(i<=n){
                    for(int j=1;j<=limit;j++){
                    if(i==k||i==limit||j==k||j==limit){
                        System.out.print(k + " ");
                    }
                    }
                }
                else{
                    
                }
            }
            System.out.println();
            limit--;
        }
    }
}
