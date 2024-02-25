package lekcija5;

import lekcija4.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {
@Test
    public void calculateDiameterTest(){
    Circle rinkis = new Circle(5);
    double diametrs = rinkis.calculateDiameter();


    Assert.assertEquals(diametrs,10.1,"Diametrs nepareizi aprēķināts");

    }
@Test
    public void calculateAreaTest(){
    Circle rinkis = new Circle(5);
    double laukums = rinkis.calculateArea();
    Assert.assertEquals(laukums,78.51, "Laukums ir nepareizi aprēķināts");
    }

}
