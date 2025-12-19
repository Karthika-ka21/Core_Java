import java.util.Scanner;

public class SelectionSort {
    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index])
                    index = j;
            }
            if (index != i) {
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
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
