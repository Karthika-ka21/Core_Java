import java.util.Scanner;

public class MergeSort {
    static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];
        }
        while(i<a.length)
            c[k++]=a[i++];
        while(j<b.length)
            c[k++]=b[j++];
    }
    static void divide(int[] a){
        if(a.length==1)
            return;
        int[] left=new int[(a.length)/2];
        int[] right=new int[a.length-left.length];
        int i=0;
        while(i<left.length)
        {
             left[i]=a[i];
             i++;
        }
           
        int j=0;
        while(j<right.length)
        {
             right[j]=a[i];
             i++;
             j++;
        }
           
        divide(left);
        divide(right);
        merge(left,right,a);
    }
    static void sort(int[] a){
        divide(a);
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
