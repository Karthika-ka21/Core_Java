import java.util.Scanner;
public class AmstrongRecursion {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting and ending range");
        int start=sc.nextInt();
        int end=sc.nextInt();
       
        while(start<=end){
            int digit=count(start);
             if(AmstrongSum(start,digit)==start){
                 System.out.println(start);
             }
            // without recursion
             // if(isAmstrong(start, digit))
            //   System.out.println(start);
            start++;
        }
    }
    static int AmstrongSum(int num,int digit){
        
        if(num==0)
            return 0;
        return power(num%10,digit)+AmstrongSum(num/10,digit);
    }
    static int count(int num){
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        return c;
    }
    static int power(int num,int exp){
        if(exp==0)
            return 1;
        return num*power(num,exp-1);
    }
    static boolean isAmstrong(int num,int digit){
        int temp=num;
        int sum=0;
        while(num>0){
            sum+=power(num%10,digit);
            num/=10;
        }
        return sum==temp;
    }
}
