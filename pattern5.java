/* 5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1  */
import java.util.*;
 class pattern5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}