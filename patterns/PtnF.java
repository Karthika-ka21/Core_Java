class PtnF
{
    public static void main(String[] args){
        /*for(int i=1;i<=5;i++){
            for(int j=5-i;j>=1;j--){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        for(int i=1;i<=5;i++){
            int k=1;
            for(int j=1;j<=5;j++){
                if(j<=5-i){
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print(k++ +" ");
                }
            }
            System.out.println();
        }
    }
}