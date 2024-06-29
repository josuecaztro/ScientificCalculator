package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;


/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {

    @Test
    void testAdd(){
        MainApplication mainApp = new MainApplication();
        Random random = new Random();

        int a = random.nextInt(1000);
        int b = random.nextInt(1000);
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        assertEquals(result, mainApp.add(a,b), "Error!!!");
    }

    //I HAD TO SET TEST FOLDER TO TEST SOURCE AND ONCE I MARKED THAT IT WORKED


}
