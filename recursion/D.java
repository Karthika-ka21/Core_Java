import java.util.Scanner;
 class D {
    public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int result=sum(arr,n-1);
    System.out.println("The sum is: " + result);
    }
    static int sum(int[] a,int n){
        if(n==0){
            return a[0];
        }
        return a[n]+sum(a,n-1);
    }
}
