package Pattrens;

import java.util.Scanner;

public class P17 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        char k='A';
        int j;
        for(int i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+k+" ");
               
            }
             k++;
            System.out.println(" ");
        }
        sc.close();
    }
}
