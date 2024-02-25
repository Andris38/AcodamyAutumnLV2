package Homework;

import java.util.Scanner;

public class MajasDarbs2 {
    public static void main(String[] args) {
//        Uzrakstīt programmu, kas saņem veselu skaitli no lietotāja un izvada vai tas ir lielāks par nulli
//        String lietotajs = "Andris";
//        System.out.println("Lietotāja vārds - " + lietotajs);
//        Scanner skeneris = new Scanner(System.in);
//        System.out.println("Ievadi veselu skaitli x...");
//        int x = skeneris.nextInt();
//        System.out.println("Skaitlis ir lielāks par 0 "  + (x>0));

//        Uzrakstīt programmu, kas paprasa lietotāja vecumu un tad izvada uz ekrāna vai lietotājs drīkst piedalīties vēlēšanās vai nedrīkst piedalīties vēlēšanās
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lūdzu, ievadiet savu vecumu... ");
//        int vecums = scanner.nextInt();
//        if (vecums>=18) {System.out.println("Drīkst piedalīties vēlēšanās!!!");}
//        if (vecums <18){System.out.println("Nedrīkst piedalīties vēlēšanās!!!");}

//        Uzrakstīt programmu, kura pieņem skaitli no 1 – 7 un tad izvada ar vārdiem kāda nedēļas diena ir
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lūdzu, ievadi cipari no 1 līdz 7 ... ");
//        int dayNumber = scanner.nextInt();
//        switch (dayNumber) {
//            case 1:
//                System.out.println("Tā ir pirmdiena");
//                break;
//            case 2:
//                System.out.println("Tā ir otrdiena");
//                break;
//            case 3:
//                System.out.println("Tā ir trešdiena");
//                break;
//            case 4:
//                System.out.println("Tā ir ceturdiena");
//                break;
//            case 5:
//                System.out.println("Tā ir piektiena");
//                break;
//            case 6:
//                System.out.println("Tā ir sestdiena");
//                break;
//            case 7:
//                System.out.println("Tā ir svētdiena");
//                break;
//            default: System.out.println("Wrong value");
//        }

//        Lietotājs ievada skaitli, Programma nosaka un izvada uz ekrāna vai skaitlis ir pāra vai nepāra
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi skaitli ... ");
        int skaitlisX = scanner.nextInt();
        if(skaitlisX %2==0) {
            System.out.println("Skaitlis ir pāra");
        }
        else {
            System.out.println("skaitlis nav pāra");}

    }
}
