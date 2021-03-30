package ch.zhaw.iwi.devops.fizzbuzz;	
import org.junit.Assert;
import org.junit.Test;



public class Aufgabe_Woche_5_Test { 


    @Test
    public void schnappszahlTest(){
        Aufgabe_Woche_5 aw5 = new Aufgabe_Woche_5();
        Assert.assertEquals("Schnappszahl", aw5.schnappszahl(31));


    }

}