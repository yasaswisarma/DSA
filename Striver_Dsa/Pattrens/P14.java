package Pattrens;
import java.util.Scanner;
public class P14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        int k=1;
        int j,l;
        for(int i=1;i<=n;i++){
            for(l=k,j=1;j<=i;j++){
                System.out.print(l);
                l++;
            }
            k=l;
            System.out.println(" ");
        }
        sc.close();
    }
}