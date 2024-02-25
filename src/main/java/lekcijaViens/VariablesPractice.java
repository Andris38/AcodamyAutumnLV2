package lekcijaViens;

public class VariablesPractice {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Suna vards
        String svards = "Reksis";
        System.out.print("Suna vards:");
        System.out.println(svards);

        //Vecums
        int svecums = 5;
        System.out.print("Suna vecums:");
        System.out.println(svecums);

        //Svars
        double svars = 10.3;
        System.out.print("Suna svars:");
        System.out.println(svars);

        //Skirne

        //Izsalkums
        boolean isHungry = true;
        System.out.print("Izsalkums:");
        System.out.println(isHungry);

        //Apraksts par sevi
        //Vards
        //Uzvards
        //Hobijs
        //Autovaditaja aplieciba
        //vecums


        String vards = "Andris";
        String uzvards = "Avotiņš";
        String hobijs = "Snovbords";
        boolean autovaditajaAplieciba = true;
        int vecums = 42;
        System.out.println("Vards:" + vards + "Uzvards:" + uzvards + "Hobijs:" + hobijs + "Autovaditaja aplieciba:" + autovaditajaAplieciba + "Vecums:" + vecums);

        //primitive data types, small letters, small memory size
        //vesels skaitlis byte/short/int/long
        byte vecumsDivi = 125;
        System.out.println(vecumsDivi);

        short test = 5000;
        int lielskaitlis=  2147483647;

        long earthPopulation = 8087822694L;
        long vecumsMans = 1L;
        System.out.println("Zemes iedzivotaju skaits: " + earthPopulation);

        //dalskaitli
        float temperatura = 36.6F;
        double garums = 182.2;
    }
}
