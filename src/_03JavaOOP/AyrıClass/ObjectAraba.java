package _03JavaOOP.AyrıClass;

public class ObjectAraba {
    public static void main(String[] args) {
        Araba benimAraba = new Araba();
        benimAraba.renk="leylak";
        benimAraba.yili=2022;
        benimAraba.motorHacmi=2200;

        System.out.println("benimAraba.renk = " + benimAraba.renk);
        System.out.println("benimAraba.motorHacmi = " + benimAraba.motorHacmi);
        System.out.println("benimAraba.yili = " + benimAraba.yili);


    }
}
