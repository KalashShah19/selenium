/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hadoop
 */
public class StringsTest {
    
    public StringsTest() {
    }

    /**
     * Test of main method, of class Strings.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Strings.main(args);
    }

    /**
     * Test of count method, of class Strings.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        String a = "kalash";
        Strings instance = new Strings();
        int expResult = 6;
        int result = instance.count(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of concatinate method, of class Strings.
     */
    @Test
    public void testConcatinate() {
        System.out.println("concatinate");
        String[] s =  {"Kalash", "Kalash", "Shah"};
        Strings instance = new Strings();
        String expResult = "KalashShah";
        String result = instance.concatinate(s);
        assertEquals(expResult, result);
    }
    
}
