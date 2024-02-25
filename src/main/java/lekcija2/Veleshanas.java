package lekcija2;

import java.util.Scanner;

public class Veleshanas {
    public static void main(String[] args) {
        System.out.println("programmas sākums");
        Scanner scanner = new Scanner(System.in);

        int vecums = scanner.nextInt();

        if (vecums>=18) {
            System.out.println("drīkst balsot!!!");
        }
        System.out.println("programmas beigas");


    }
}
