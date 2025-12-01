import java.util.Scanner;
class BubbleSort{
    static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
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