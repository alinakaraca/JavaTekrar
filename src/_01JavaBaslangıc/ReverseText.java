package _01JavaBaslangıc;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {

        // girilen bir yazıyı tersten yazdırma;

        Scanner sc= new Scanner(System.in);
        System.out.print("text giriniz:");
        String text = sc.nextLine();
        String reverse="";

        for (int i = text.length()-1; i >=0 ; i--) {
            reverse=reverse+text.charAt(i);
        }
        System.out.print("reverse of text:"+reverse);
  }
}
