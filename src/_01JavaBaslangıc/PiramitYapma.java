package _01JavaBaslangıc;

import java.util.Scanner;

public class PiramitYapma {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("piramit için sayı giriniz:");
        int satirSayisi=sc.nextInt();

        for (int satir = 0; satir < satirSayisi; satir++) {

            for (int bosluk = 0; bosluk < satirSayisi-(satir+1) ; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz=0; yildiz<1+(satir*2);yildiz++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
