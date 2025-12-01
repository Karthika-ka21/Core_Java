import java.util.Scanner;
    
class Ptn11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int spaces=n/2,gap=1, limit=n/2;
        for(int i=1;i<=n;i++){
            if(i<=n/2+1){
                for(int j=1;j<=spaces;j++){
                    System.out.print(" "+" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
                spaces--;
            }
            else{
                
                for(int j=1;j<=gap;j++){
                    System.out.print(" "+" ");
                }
                for(int j=n+1-i;j>=1;j--){
                    System.out.print(j+" ");
                }
                for(int j=2;j<=limit;j++){
                    System.out.print(j+" ");
                }
                limit--;
                gap++;
                System.out.println();
                
            }
        }
        System.out.println(spaces+" "+gap+" "+limit);
}
}
