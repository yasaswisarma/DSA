package Pattrens;

import java.util.Scanner;

public class P16 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        char k;
        int j;
        for(int i=n;i>=1;i--){
            for(k='A', j=i;j>=1;j--){
                System.out.print(" "+k+" ");
                k++;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
