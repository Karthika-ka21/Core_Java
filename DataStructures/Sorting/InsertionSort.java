import java.util.Scanner;

public  class InsertionSort {
    static void sort(int[] a){
        for(int i=0;i<a.length;i++){
            int key=a[i];
            int j;
            for(j=i-1;j>=0&&a[j]>key;j--){
                a[j+1]=a[j];
            }
            a[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
