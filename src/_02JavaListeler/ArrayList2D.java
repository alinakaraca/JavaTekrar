package _02JavaListeler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();

        ArrayList<Integer> matNotlar = new ArrayList<>();
        Collections.addAll(matNotlar, 60, 70, 80);

        ArrayList<Integer> fizNotlar = new ArrayList<>();
        Collections.addAll(fizNotlar, 65, 75, 85);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        Collections.addAll(kimNotlar, 77, 66, 99);

        Collections.addAll(notlarListesi, matNotlar, fizNotlar, kimNotlar);
        System.out.println("notlarListesi=" + notlarListesi);

        System.out.println("matNotlar=" + notlarListesi.get(0));
        System.out.println("fizNotlar=" + notlarListesi.get(1));
        System.out.println("kimNotlar=" + notlarListesi.get(2));
        System.out.println("kimNotlar=" + notlarListesi.get(2).get(0));
        System.out.println("kimNotlar=" + notlarListesi.get(2).get(1));
        System.out.println("kimNotlar=" + notlarListesi.get(2).get(2));


        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi = " + notlarListesi.get(i));
        }
        System.out.println("******************");

        ArrayList<String> dersler = new ArrayList<>();
        Collections.addAll(dersler, "Matematik", "Fizik", "Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(dersler.get(i) + " = ");
                System.out.print((i + 1) + ".sayfa, " + (j + 1) + ".not = ");
                System.out.println(notlarListesi.get(i).get(j));
            }
            System.out.println("******************");
        }
    }
}
