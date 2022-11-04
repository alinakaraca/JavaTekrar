package _02JavaListeler;

import java.util.*;

public class Setler {
    public static void main(String[] args) {

        int sayi=5;  // hafızada 1 sayı tutar
        int[] dizi=new int[5];  // hafızada 5 rakam tutuyor.
        int[][] tablo=new int[3][4];  // 12 adet sayı tutuyor.

        // dinamik boyutlu diziler lazım.
        ArrayList<Integer> liste=new ArrayList<>(); // boyu eklendikçe artan dinamik dizi.
        ArrayList< ArrayList<Integer> > listelerinListesi=new ArrayList<>(); // dinamik 2 boyutlu

        // Bana artık elemanları gelişigüzel miktarınca tutan değil, aynı elemanları tutmayan (ama büyük küçük harf duyarlılığı var)

        // SETS
        // HashSet (hızlı),
        // LinkedHashSet(ekleme sırası göre sıralı),
        // TreeSet(herzaman sıralı)

        // Hızlı çalışmak için keni özel algoritma sırasına göre saklar
        HashSet<String> hs=new HashSet<>();
        Collections.addAll(hs,"bir","iki","üç","dört","beş"); // bu sekilde de setlere ekleme yapabiliriyoruz yine.
        //hs.add("bir");
        //hs.add("iki");
        //hs.add("üç");
        //hs.add("dört");
        //hs.add("bes");
        System.out.println("hs = " + hs); // hs = [bes, dört, iki, bir, üç]

        // Eklenme sırasına göre elemanlarını tutuyor
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        Collections.addAll(lhs,"bir","iki","üç","dört","beş");
        System.out.println("lhs = " + lhs); //lhs = [bir, iki, üç, dört, bes]

        //Alfabetik olarak sıralı tutar
        TreeSet<String> ts=new TreeSet<>();
        Collections.addAll(ts,"bir","iki","üç","dört","beş");
        System.out.println("ts = " + ts); //ts = [bes, bir, dört, iki, üç]

        //sayısal sıraya göre sıralı tutuyor
        TreeSet<Integer> ts2=new TreeSet<>();
        Collections.addAll(ts2,5,89,3,17,1);
        System.out.println("ts2 = " + ts2); //ts2 = [1, 3, 5, 17, 89]

        //Ekrana yazdırma 1.yöntem
        System.out.println("sayılar = " + ts2);

        //Ekrana tek tek yazdırma 2.Yöntem
        for(Integer sayilar : ts2 ) // yazdırma sırası garanti etmiyor. TreeSet kullansak bile sıralama garantisi vermez.
            System.out.println("sayılar = " + sayilar);

            //garanti sıralı gelsin istersek:
            Iterator sıralı=ts2.iterator(); // indexin yaptığını yapıyor
            while (sıralı.hasNext()) // setlerin kendi içindeki sırasına göre elemanlara ulaşmak için
                System.out.println("sıralı şekli:"+sıralı.next()); // sıradaki elemanı gösteriyor.


        HashSet hashSet=new HashSet();
        //HashSet<Object> hashSet1 = new HashSet<>(); //aslında üsttekinin tanımlaması bu şekilde ama Object yazmadan da aynı işi görüyor.
        Collections.addAll(hashSet,"bes",1,"aziz",4.5,true);

        System.out.println("hs = " + hashSet);
        //System.out.println("hs1 = " + hashSet1);

        for(Object o: hashSet) // Object : bütün tiplerin atası
            System.out.println("o = " + o);

    }
}
