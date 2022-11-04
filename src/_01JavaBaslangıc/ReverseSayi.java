package _01JavaBaslangıc;

import java.util.Scanner;

public class ReverseSayi {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi=sc.nextInt();
        int reverse=0;

        while (sayi>0) {
            reverse=reverse*10+sayi%10;
            sayi=sayi/10;
        }
        System.out.println("reverse:"+reverse);
    }
}
