package lekcija2;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String istaParole = "a1234";
        System.out.println("Ievadi savu paroli...");
        Scanner scanner = new Scanner(System.in);
       String ievaditaParole = scanner.nextLine();

       if (ievaditaParole.equals(istaParole)){
           System.out.println("Parole ir pareiza! Apsveicu!");
       }else {
           System.out.println("Parole nav pareiza! Pieeja liegta!");
       }
    }
}
