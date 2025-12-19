import java.util.Arrays;
public class Shift0sRight {
    public static void main(String[] args) {
        int[] a={0,1,6,0,0,5,2,8,9};
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[index]=a[i];
                index++;
            }
        }
        while(index<a.length){
            a[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(a));
    }
}
