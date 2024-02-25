package lekcija3;

public class Masivi {
    public static void main(String[] args) {
        String pietura = "Centrala stacija";
        String pietura1 = "Marijas iela";
        String pietura2 = "Lačpleša iela";


        String[] pieturas = {"Centrala stacija","Marijas iela","Lačpleša iela","Matīsa iela","Jauna pietura","Sestā pietura"};
        int garums = pieturas.length;



        for (String s : pieturas) {
            System.out.println("Pietura: " + s);

        }

        System.out.println("Masīva pieturas garums ir :"+garums);

        int[] majNumuri = {1,3,5,7,9,11};
//        System.out.println(pieturas[2]);

        String[] autoMarkas = new String[3];
        autoMarkas[0]="BMW";
        autoMarkas[1] = "AUDI";
        autoMarkas[2]= "MERCEDES";

        System.out.println(autoMarkas[1]);

//        System.out.println(pieturas[0]);
//        System.out.println(pieturas[1]);
//        System.out.println(pieturas[2]);
//        System.out.println(pieturas[3]);

        for (int i = 0; i <=3; i++) {
//            System.out.println(pieturas[i]);
        }

        for (int i = 0; i <=pieturas.length-1; i++) {
            System.out.println(pieturas[i]);
        }

    }
}
