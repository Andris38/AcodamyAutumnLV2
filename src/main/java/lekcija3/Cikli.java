package lekcija3;

public class Cikli {
    public static void main(String[] args) {

        int i=0;
        while (i<5){
           System.out.println("Print i: " + i);
           i = i+1;
        }
        int a = 0;
        while (a<10){
            System.out.println("A vertība ir; "+a);
            a=a+1;
        }
        for (int j = 0; j <= 10; j++) {
            System.out.println("Cikls izpildās "+ j+ " reizi");
        }
    }

    static void printNameSurname(){
        System.out.println("########");
        System.out.println("Andris");
        System.out.println("Avotiņš");
        System.out.println("*********");
    }
}
