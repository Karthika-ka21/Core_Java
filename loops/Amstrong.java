import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int count,sum=0;
        int temp=n;
        for(count=0;n!=0;count++)
        {
            count++;
            n=n/10;
        }
        n=temp;
        
        int t=n;
        while(t>0)
        {
            int a = t % 10;
            int res = 1;
            for(int i = 0; i < count; i++) {
                res = res * a;
                //System.out.print(res + "a ");
            }
            //System.out.print(res+"a");
            sum += res;
            t /= 10;
        
            
        }
        System.out.println(" " + sum);
        
        if(sum==temp)
        {
            System.out.println("amstrong number");
        }
        else
        {
            System.out.println("not amstrong number");
        }
        
    }
    
}
