package Pattrens;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
