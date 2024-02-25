package lekcija4;

import java.util.ArrayList;

public class LekcijaCetri {
    public static void main(String[] args) {
//        String[] cars = {"VW","AUDI","BMW"};
//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);
//
//        cars[0]="MAZDA";
//
//        for (String car : cars) {
//            System.out.println(car);
//        }

        ArrayList<String> cars2 = new ArrayList<>();
        ArrayList<Integer> majuNumuri = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();

        cars2.add("MERCEDES");
        cars2.add("Bentley");
        cars2.add("HONDA");
        System.out.println(cars2.get(0));
        System.out.println(cars2.get(1));
        System.out.println(cars2.get(2));

        System.out.println("FOR cikls");
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }

        System.out.println("FOR EACH cikls");
        for (String s : cars2) {
            System.out.println(s);
        }

        cars2.remove(0);
        System.out.println("FOR EACH cikls ar REMOVE 0");
        for (String s : cars2) {
            System.out.println(s);
        }
        cars2.set(0, "VOLVO");
        System.out.println("FOR EACH cikls ar REMOVE 0");
        for (String s : cars2) {
            System.out.println(s);
        }

//        cars2.remove("HONDA");
//        for (String s : cars2) {
//            System.out.println(s);
//        }
        System.out.println("Vai saraksts satur HONDA?"+ cars2.contains("HONDA"));


    }
}
