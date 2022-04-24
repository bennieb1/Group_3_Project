/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author User
 */
public class PlayerTest {
    
    @Test
    public void testCheckNameGood() {
        System.out.println("checkNameGood");
        Player p1 = new Player("Ahmed");
        String s1 = "AmrA";
        boolean expResult = true;
        boolean result = p1.checkName(s1); 
        assertEquals(expResult, result);
    }//end of testCheckNameGood
    @Test
    public void testCheckNameBad() {
        System.out.println("checkNameBad");
        Player p1 = new Player("Amr");
        String pswd = "Amr";
        boolean expResult = false;
        boolean result = p1.checkName(pswd); 
        assertEquals(expResult, result);
    }//end of testCheckNameBad
    @Test
    public void testCheckNameBoundary() {
        System.out.println("checkNameBundary");
        Player p1 = new Player("AmrA");
        String pswd = "Amr";
        boolean expResult = true;
        boolean result = p1.checkName(pswd); 
        assertEquals(expResult, result);
    }//end of testCheckNameBoundary 
    
    @Test
    public void testCheckGetHandSumGood() {
        System.out.println("CheckGetHandSumGood");
        Player p1= new Player("Jojo");
        boolean expResult = true;
        boolean result = p1.checkGetHandSum(true); 
        assertEquals(expResult, result);
    }//end of testCheckNameBoundary 
    @Test
    public void testCheckGetHandSumBad() {
        System.out.println("CheckGetHandSumBad");
        Player p1= new Player("Jojo");
        boolean expResult = false;
        boolean result = p1.checkGetHandSum(false); 
        assertEquals(expResult, result);
    }//end of testCheckNameBoundary 
    @Test
    public void testCheckGetHandSumBoundary() {
        System.out.println("CheckGetHandSumBoundary");
        Player p1= new Player("Jojo");
        boolean expResult = true;
        boolean result = p1.checkGetHandSum(true); 
        assertEquals(expResult, result);
    }//end of testCheckNameBoundary 
    
}
