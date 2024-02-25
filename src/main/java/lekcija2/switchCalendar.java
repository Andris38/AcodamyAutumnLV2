package lekcija2;

public class switchCalendar {
    public static void main(String[] args) {
        int day = 8;
        switch (day){
            case 1: System.out.println("Pirmdiena");
                break;
            case 2: System.out.println("otrdiena");
                break;
            case 3: System.out.println("trešdiena");
                break;
            case 4: System.out.println("ceturdiena");
                break;
            case 5: System.out.println("piektiena");
                break;
            case 6: System.out.println("sestdiena");
                break;
            case 7: System.out.println("svētdiena");
                break;
            default: System.out.println("Tāda diena nav");
        }
    }
}
