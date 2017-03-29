package com.stateauto.test;

import com.stateauto.FizzBuzz;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Created by wea3765 on 3/28/2017.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    private void assertCountStringInArray(String[] items, String keyToFind, int expectedCount) {
        int actualCount = 0;
        System.out.println("keyToFind: " + keyToFind + ", expectedCount: " + expectedCount);
        System.out.println("---");
        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            System.out.println("i: " + (i+1) + ", item: " + item);
            if (item.equals(keyToFind)) {
                actualCount++;
            }
        }
        assertEquals(expectedCount, actualCount);
    }

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void countToOneTest() throws Exception{
       String[] ret= fb.countToOne();
       assertEquals("1",ret[0]);
    }

    @Test
    public void countToTwoTest() throws Exception{
        String[] ret= fb.countToTwo();
        assertEquals("1",ret[0]);
        assertEquals("2",ret[1]);
    }

    @Test
    public void countToThreeTest() throws Exception {
        String[] ret = fb.countToThree();
        assertCountStringInArray(ret, "fizz", 1);
    }

    @Test
    public void countToOneHundredTest() throws Exception {
        String[] ret =fb.countToOneHundred();
        assertTrue(ret.length == 100);
        assertCountStringInArray(ret, "fizz", 33);
        assertCountStringInArray(ret, "buzz", 14);
        assertEquals("buzz",ret[99]);
    }


//    @Test
//    public void countToSixTest() throws Exception {
//        String[] ret = fb.countToSix();
//        assertEquals("1", ret[0]);
//        assertEquals("2", ret[1]);
//        assertEquals("fizz", ret[2]);
//        assertEquals("4", ret[3]);
//        assertEquals("buzz", ret[4]);
//        assertEquals("fizz", ret[5]);
//    }
//
//
//    @Test
//    public void countToFiveTest() throws Exception {
//        String[] ret = fb.countToFive();
//        assertEquals("1", ret[0]);
//        assertEquals("2", ret[1]);
//        assertEquals("fizz", ret[2]);
//        assertEquals("4", ret[3]);
//        assertEquals("buzz", ret[4]);
//    }

//    @Test
//    public void countToEightTest() throws Exception {
//        String[] ret = fb.countToEight();
//        assertEquals("1", ret[0]);
//        assertEquals("2", ret[1]);
//        assertEquals("fizz", ret[2]);
//        assertEquals("4", ret[3]);
//        assertEquals("buzz", ret[4]);
//        assertEquals("fizz", ret[5]);
//        assertEquals("7", ret[6]);
//        assertEquals("8", ret[7]);
//    }
}

