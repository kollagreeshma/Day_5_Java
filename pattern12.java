/* E         
E D       
E D C     
E D C B   
E D C B A  */
import java.util.*;
 class pattern13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j>=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}