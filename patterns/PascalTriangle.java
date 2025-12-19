public class PascalTriangle {
    static int[][] pascal(int size){
        int[][] a=new int[size][];
        for(int i=0;i<size;i++){
            a[i]=new int[i+1];
            for(int j=0;j<a[i].length;j++){
                if(j==0||j==i){
                    a[i][j]=1;
                }
                else{
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int size=7;
        int[][] a=pascal(size);
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
