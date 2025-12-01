class PtnT {
    public static void main(String[] args) {
         for(int i=5;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
        System.out.println();

        //using 2 loops
        for(int i=1;i<=5;i++){
            int k=5;
            for(int j=1;j<=5;j++){
                if(j<=5-i){
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print(k-- +" ");
                }
            }
            System.out.println();
        }
    }
}
          
          