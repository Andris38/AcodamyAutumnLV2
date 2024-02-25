package lekcija4;

public class Circle {


    double PI = 3.14;
    double r;

//    Circle(){
//        System.out.println("Tiek taisīts jauns aplis...");
//    }
    public Circle(double radiuss){
      this.r = radiuss;
    }

    public double calculateArea(){
        return PI*(r*r);
    }
    public double calculateDiameter(){
        return r*2;
    }
}
