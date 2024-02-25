package Homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTesti {
    @Test
public void saskaitishanasTest(){
        Calculator saskaitishana = new Calculator();
        int summa = saskaitishana.sum(2,3);

        Assert.assertEquals(summa,6);
    }
@Test
    public void dalishanasTest(){
        Calculator dalishana = new Calculator();
        double daliit = dalishana.dalisana(2,3);

        Assert.assertEquals(daliit,6);
    }
    @Test
    public void reizinashanasTest(){
        Calculator reizinashana = new Calculator();
        int reizinaat = reizinashana.reizinasana(2,3);

        Assert.assertEquals(reizinaat,6);
    }
    @Test
    public void atnemshanasTest(){
        Calculator atnemshana = new Calculator();
        double atnemt = atnemshana.atnemsana(2,3);

        Assert.assertEquals(atnemt,6);
        int atnemsana;

    }
}
