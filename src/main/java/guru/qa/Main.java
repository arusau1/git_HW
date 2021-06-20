package guru.qa;

public class Main {

    static NKVD nkvd = new NKVD();

    //целые числа
    byte byteVar;
    short aShort;
    int anInt;
    long aLong;

    //числа с плавающей точкой
    double aDouble;
    float aFloat;

    //логический тип
    boolean aBoolean;

    //символ
    char aChar;


    public static void main(String[] args) {



//        Human.sayCountry();
//        Kulak kulak = new Kulak("Ваня");
//        kulak.born();
//
//
//
//        kulak.age = 31;
//        Human.country = "England";

        Kulak anotherkulak = new Kulak("Борис");

        anotherkulak.age = 19;

//        System.out.println(kulak.name);
//        System.out.println(kulak.age);
//        System.out.println(anotherkulak.name);
//        System.out.println(anotherkulak.age);
//        kulak.noFart();
//        anotherkulak.noFart();
////        kulak.sayCountry();
////        anotherkulak.sayCountry();
//
//        int kulakAge = kulak.getAge();
//        System.out.println(kulakAge);

        System.out.println(anotherkulak.age);
        nkvd.checkAge(anotherkulak);

    }

}
