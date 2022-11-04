package _02JavaListeler;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListler {
    public static void main(String[] args) {

    ArrayList<Integer> rakamlar=new ArrayList<>();
        Collections.addAll(rakamlar,50,5,456,45,3);
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

    //Collections.addAll(rakamlar,50,5,456,45,3); bu şekilde topluca girebiliriz. tek tek girmemiz gerekmiyor

        System.out.println("rakamlar ilk hali = " + rakamlar);

    //Sıralama işlemleri

        Collections.sort(rakamlar); // küçükten büyüğe
        System.out.println("rakamlar.sort = " + rakamlar);

        Collections.reverse(rakamlar); // tersine çevirir.
        System.out.println("rakamlar.reverse = " + rakamlar);

        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        Collections.fill(rakamlar,0); // bütün elemanlara verilen değeri atar
        System.out.println("Collections.fill(0) = " + rakamlar);

        Collections.replaceAll(rakamlar,0,2); // 0 ları 2 ile değiştirdi
        System.out.println("Collections.replaceAll(rakamlar,0'ı 2'ye) = " + rakamlar);

}
}
