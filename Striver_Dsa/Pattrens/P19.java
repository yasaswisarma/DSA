package Pattrens;
import java.util.Scanner;
public class P19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        
        int l;
        char s =  (char)('A'+(n-1));
        for(int i = 0; i < n; i++){
            l=i;
            for(int j=0;j<=i;j++){
                System.out.print(" "+(char)(s-l)+" ");
                l--;
            }
            System.out.println();
        }
        sc.close();
    }
}