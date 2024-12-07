/*A B C D E 
B C D E   
C D E     
D E       
E   */
import java.util.*;
 class pyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}