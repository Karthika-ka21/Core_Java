import java.util.Scanner;

public class QuickSort {
    static void sort(int[] a, int start, int end) {
        if (start >= end)
            return;
        int pivot = a[(start + end) / 2];
        int i = start, j = end;
        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        sort(a, 0, j);
        sort(a, i, end);
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
        sort(a,0,a.length-1);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
