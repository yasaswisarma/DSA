 package Pattrens;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        for(int i=n-1; i>=0; i--){
            for(int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            for(int j=2*i+1; j>0; j--){
                System.out.print("*");
            }
            for(int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
