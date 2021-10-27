/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class Clase1Test {
    
    public Clase1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Clase1.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Clase1 instance = new Clase1();
        int expResult = 0;
        int result = instance.sumar(5, 4);
        assertEquals(9, result);
        
    }
    
}
