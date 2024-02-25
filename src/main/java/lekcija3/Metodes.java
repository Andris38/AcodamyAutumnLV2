package lekcija3;

import java.util.Scanner;

public class Metodes {
    public static void main(String[] args) {

     printInfoAboutDog();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi malu a: ");
        int vienaMala = scanner.nextInt();
        System.out.println("Ievadi malu b: ");
        int otraMala = scanner.nextInt();


        int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(vienaMala,otraMala);
        System.out.println("laukumns ir: " + aprekinataisLaukums);

        int kvadrataLaukums = aprekinatKvadrataLaukumu( 10);
        System.out.println(kvadrataLaukums);

        printInfoAboutDog2("Lesija",5,15.3);
    }
    static int aprekinatKvadrataLaukumu(int kvadrataMala){
        return kvadrataMala * kvadrataMala;
    }
    static int aprekinatTaisnsturaLaukumu(int a, int b) {
        int laukums = a * b;
        return laukums;

    }

    static void printInfoAboutDog(){
        String dogname = "Reksis";
        int dogAge = 8;
        double dogWeight = 10.3;
        System.out.println("Mana suņa vārds ir: " + dogname);
        System.out.println("Mana suņa vecums ir: " + dogAge);
        System.out.println("Mana suņa svars ir: " + dogWeight);
        System.out.println("\n");
    }
    static void printInfoAboutDog2(String name, int age, double weight){
        System.out.println("Mana suņa vards ir: " + name);
        System.out.println("Mana suņa vecums ir: " + age);
        System.out.println("Mana suņa svars ir: " + weight);
        System.out.println("\n");
    }
    static double aprekinatRinkaLaukumu(int radiuss) {
        return 3.14 * (radiuss * radiuss);
    }

}
