package _03JavaOOP.Ornek;

public class Main {
    public static void main(String[] args) {

        Person person1=new Person();
        person1.name="Aziz";
        person1.surname="Karaca";
        person1.age=36;

        Person person2=new Person();
        person2.name="Alina";
        person2.surname="Karaca";
        person2.age=30;

        person1.PrintPersonInfo();
        person2.PrintPersonInfo();

    }
}
