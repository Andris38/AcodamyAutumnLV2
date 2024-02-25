package lekcija2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Lekcija Nr.2");
//        //Lietotāja ievades apstrāde
//        String name = "Juris";
//        Scanner skeneris = new Scanner(System.in);
//        System.out.println("Ievadi skaitli x...");
//        int x = skeneris.nextInt();
//        System.out.println("Skaitlis x veiksmīgi saglabāts. Tas ir:" +  x);
//
//        System.out.println("Ievadi skaitli y...");
//        int y = skeneris.nextInt();
//        System.out.println("Skaitlis y veiksmīgi saglabāts. Tas ir:" +  y);
//
//        System.out.println("x+y summa ir:" + (x+y));
//        System.out.println("x-y summa ir:" + (x-y));


     int x = 5;
     int y = 3;
     int z = 3;
     System.out.println("x ir lielāks par y "  + (x>y));
        System.out.println("x ir lielāks par y "  + (x<y));
        System.out.println("y ir vienāds ar z "  + (y==z));
        System.out.println("x ir vienāds z "  + (x==z));
        System.out.println("y ir vienāds ar z "  + (y!=z));
        System.out.println("x ir vienāds z "  + (x!=z));

        System.out.println("y ir lielāks vienāds par z "  + (y>=z));
        System.out.println("x ir lielāks vienāds par y "  + (x>=y));


//        Scanner skeneris2 = new Scanner(System.in);
//        int a = skeneris2.nextInt();
//        int b = skeneris2.nextInt();
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a==b);
//        System.out.println(a!=b);

        String name = "Andris";
        String name2 = "Pēteris";
        System.out.println(name.equals("Andris"));
        System.out.println(name.equals(name2));

        System.out.println(!name.equals(name2));

//        int x1 = 5;
//        System.out.println((x1>5)&&(x1>7));
//
//        int x2 = 8;
//        System.out.println((x2>=5)&&(x2>7));

        int x1 = 5;
        System.out.println((x1>=5)&&(x1>7));
        System.out.println((x1>=5)||(x1>7));

        int x2 = 8;
        System.out.println((x2>=5)&&(x2>7));
        System.out.println((x2>=5)||(x2>7));




    }
}
