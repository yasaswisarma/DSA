package Pattrens;

import java.util.Scanner;

public class P18 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        char k;
        char h;
        for(int i=0;i<n;i++){
            h='A';
            for(int j=0;j<(n-(i+1));j++){
                System.out.print(" ");
            }
            k='A';
            for(int j=0;j<((2*i)+1);j++){
                if(j<=i){
                System.out.print(k);
                k++;
               }
                else{
                   
                    System.out.print(h);
                    h++;
                }
              
            }
            for(int j=0;j<(n-(i+1));j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
