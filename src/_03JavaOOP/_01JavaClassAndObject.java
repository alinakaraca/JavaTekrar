package _03JavaOOP;

public class _01JavaClassAndObject {
    // metodların yazıldıgı yerler
    public static void main(String[] args) {

        Araba benimAraba = new Araba();
        benimAraba.renk="sarı";
        benimAraba.yili=2020;
        benimAraba.motorHacmi=2000;

        System.out.println("benimAraba.renk = " + benimAraba.renk);

    }
    // metodların yazıldıgı yerler
}
class Araba{
    String renk;
    int yili;
    double motorHacmi;
}