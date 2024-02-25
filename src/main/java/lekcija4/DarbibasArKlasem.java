package lekcija4;

import java.util.ArrayList;

public class DarbibasArKlasem {
    public static void main(String[] args) {

Dog mansSuns = new Dog("Reksis",5,13.3,"VAS");

//mansSuns.name = "Reksis";
//mansSuns.age = 5;
//mansSuns.weight = 13.3;
//mansSuns.bread = "VAS";

mansSuns.makeSound();
mansSuns.prinDog();

Dog kaiminaSuns = new Dog();
kaiminaSuns.setName("Fido");
kaiminaSuns.setAge(8);
kaiminaSuns.setWeight(25.1);
kaiminaSuns.setBread("Dalmācietis");

kaiminaSuns.prinDog();
kaiminaSuns.makeSound();

Home manaMaja = new Home();
manaMaja.ielasNosaukums = "Brīvības iela";
manaMaja.majasNumurs = 100;
manaMaja.printAdress();

        ArrayList<String>materiali = new ArrayList<>();

manaMaja.apdaresMateriali = materiali;
materiali.add("Parkets");
materiali.add("Flīzes");

Circle rinkis1 = new Circle(25);
rinkis1.r = 25;
System.out.println("Riņķa laukums ir "+rinkis1.calculateArea());
        System.out.println("Riņķa diameters ir "+rinkis1.calculateDiameter());


        Circle rinkis2 = new Circle(32);
        System.out.println("Riņķa laukums ir "+rinkis2.calculateArea());
        System.out.println("Riņķa diameters ir "+rinkis2.calculateDiameter());
    }
}

