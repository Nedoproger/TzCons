/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package consulting.tz.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aksam
 */
public class StringServiceIT {
    
    public StringServiceIT() {
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
     * IDE просто отказалось запускать любые виды тестов, проблему так и не откопал :)
     */
    @Test
    public void testGetNumberOfString() {
        System.out.println("getNumberOfString");
        String s = "aaabbbbccc";
        StringService instance = new StringService();
        Map<Character, Integer> expResult = new LinkedHashMap<Character,Integer>();
        Map<Character, Integer> result = instance.getNumberOfString(s);
        assertEquals(expResult, result);
    }
    
}
