/* E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A  */
import java.util.*;
 class pattern6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}