/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hadoop
 */
public class JavaTestTest {
    

    /**
     * Test of main method, of class JavaTest.
     */
    @Test
    public void testMain() {
        
    }

    /**
     * Test of add method, of class JavaTest.
     */
    @Test
    public void testAdd() {
       System.out.println("Add");
       JavaTest jt = new JavaTest();
       int result = jt.add(10,9);
       int expected = 19;
       assertEquals(expected, result);
    }
    
    @Test
    public void testMultiply() {
       System.out.println("Multiply");
       JavaTest jt = new JavaTest();
       int result = jt.multiply(1,2,3);
       int expected = 6;
       assertEquals(expected, result);
    }

    /**
     * Test of compareStr method, of class JavaTest.
     */
    @Test
    public void testCompareStr() {
        System.out.println("compareStr");
        String a = "Kalash";
        String b = "kalash";
        JavaTest instance = new JavaTest();
        boolean expResult = false;
        boolean result = instance.compareStr(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of lenCheck method, of class JavaTest.
     */
    @Test
    public void testLenCheck() {
        System.out.println("lenCheck");
        String a = "kalash";
        String b = "kalash shah";
        JavaTest instance = new JavaTest();
        boolean expResult = false;
        boolean result = instance.lenCheck(a, b);
        assertEquals(expResult, result);
    }
    
    
}
