/* 5         
5 4       
5 4 3     
5 4 3 2   
5 4 3 2 1  */
import java.util.*;
 class pattern11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}