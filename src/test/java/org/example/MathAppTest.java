package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author LDC
 */
public class MathAppTest {

    private MathApp mathApp;

    @Before
    public void setup() {
        mathApp = new MathApp();
    }

    @Test
    public void multiply() {
        assertEquals(1800, mathApp.multiply(3, 600));
    }

    @Test
    public void subtract() {
        assertEquals(300, mathApp.subtract(500, 200));
    }
}
