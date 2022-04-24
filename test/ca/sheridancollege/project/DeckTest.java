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
public class DeckTest {
    
    @Test
    public void testChecktGetCardDeckGood() {
        System.out.println("checkGetCardDeckGood");
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.checkGetCardDeck(1);
       assertEquals(expResult, result);
    }
    
    @Test
    public void testChecktGetCardDeckBad() {
        System.out.println("checkGetCardDeckBad");
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.checkGetCardDeck(0);
       assertEquals(expResult, result);
    }
    @Test
    public void testChecktGetCardDeckBoundary() {
        System.out.println("checkGetCardDeckBoundary");
        Deck instance = new Deck();
        boolean expResult = true;
        boolean result = instance.checkGetCardDeck(1);
       assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckDealNextGood() {
        System.out.println("checkGetCardDeckGood");
        Deck instance = new Deck();
        boolean expResult = true;
        boolean result = instance.checkDealNext(true);
       assertEquals(expResult, result);
    }
    @Test
    public void testCheckDealNextBad() {
        System.out.println("checkGetCardDeckBad");
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.checkDealNext(false);
       assertEquals(expResult, result);
    }@Test
    public void testCheckDealNext() {
        System.out.println("checkGetCardDeckBoundary");
        Deck instance = new Deck();
        boolean expResult = true;
        boolean result = instance.checkDealNext(true);
       assertEquals(expResult, result);
    }
    

}
