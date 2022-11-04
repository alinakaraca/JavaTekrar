package _02JavaListeler;

import java.util.HashMap;
import java.util.Map;

public class MaplerInteger {
    public static void main(String[] args) {

        //Maps - HashMap / TreeMap / LinkedHashMap

        //HashMap<Integer, Integer> map = new HashMap<>(); // key ve value si ınteger olan bir MAP
        Map<Integer, Integer> list = new HashMap<>(); // tüm Mapleri bu şekilde başlata biliriz "Map" ailesinden "HashMap"
        list.put(2,11); // 2. key içine 11 atandı
        list.put(3,12);
        list.put(6,15);
        list.put(2,5); // 2. key i 5 olarak güncelledi.

        System.out.println("maps="+list); // maps={2=5, 3=12, 6=15} yani key=value
        System.out.println("list.get(2) = " +list.get(2)); // 2. keydeki elemanı verir yani 5 i
        System.out.println("list.keySet() = " + list.keySet());
        System.out.println("list.values() = " + list.values());

        for (Integer keys : list.keySet())
            System.out.println("keys = " + keys);

        for (Integer values : list.values())
            System.out.println("values = " + values);

        for (Map.Entry<Integer, Integer> anahtar : list.entrySet())
        {
            System.out.println("anahtar.getKey() = " + anahtar.getKey());
            System.out.println("anahtar.getValue() = " + anahtar.getValue());
        }
        System.out.println("m.containsKey(2) = " + list.containsKey(2)); //true
        System.out.println("m.containsValue(12) = " + list.containsValue(12)); //true

        list.remove(2); // 2 anahtarındaki her sey siliniyor
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());

        list.clear();
        System.out.println("listBos = " + list);

    }
}
