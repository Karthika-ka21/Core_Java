import java.util.Scanner;

class BinaryToDecimal
{
    public static void main(String[] args){
        int rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number");
        int num=sc.nextInt();
        String s="\t";
        while(num>1||num>0)
        {
            rem=num%2; 
            num=num/2;
            s=rem+s;
        }
        System.out.println("binary number:"+s);
    }
}