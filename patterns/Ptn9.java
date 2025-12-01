 //triangle with 0,1
 import java.util.Scanner;
 class Ptn9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           if(i<=n/2+1){
            for(int j=1;j<=i;j++){
                
                    if(i%2!=0){  
                        if(j%2!=0){
                            System.out.print("0"+" ");
                        }else{
                            System.out.print("1"+" ");
                        }
                    }

                    else{
                        if(j%2!=0){
                            System.out.print("1"+" ");
                        }else{
                            System.out.print("0"+" ");
                        }
                   
                    }
            }
            System.out.println();
        }
         else{

            for(int j=1;j<=n+1-i;j++){
                if(i%2!=0){  
                    if(j%2!=0){
                        System.out.print("0"+" ");
                    }else{
                        System.out.print("1"+" ");
                    }
                }else{
                    if(j%2!=0){
                        System.out.print("1"+" ");
                    }else{
                        System.out.print("0"+" ");
                    }
                }
                
            }
            System.out.println();
        }
        }
        }
    }
 