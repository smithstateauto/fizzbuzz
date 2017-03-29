package com.stateauto.test;

import com.stateauto.FizzBuzz;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertNotNull;

public class FizzBuzzTest {

    private FizzBuzz fb;

    private void assertCountStringInArray(String[] items, String keyToFind, int expectedCount) {
        int actualCount = 0;
        System.out.println("\nkeyToFind: " + keyToFind + ", expectedCount: " + expectedCount);
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
       String[] ret= fb.countToManyAsString(1);
       assertEquals("1",ret[0]);
    }

    @Test
    public void countToTwoTest() throws Exception{
        String[] ret= fb.countToManyAsString(2);
        assertEquals("1",ret[0]);
        assertEquals("2",ret[1]);
    }

    @Test
    public void countToThreeTest() throws Exception {
        String[] ret = fb.countToManyAsString(3);
        assertCountStringInArray(ret, "fizz", 1);
    }

    @Test
    public void countToFifteenTest() throws Exception {
        String[] ret = fb.countToManyAsString(15);
        assertTrue(ret.length == 15);
        assertCountStringInArray(ret, "fizz buzz", 1);
    }

    @Test
    public void countToThirtyTest() throws Exception {
        String[] ret = fb.countToManyAsString(30);
        assertTrue(ret.length == 30);
        assertCountStringInArray(ret, "fizz buzz", 2);
    }

    @Test
    public void countToOneHundredTest() throws Exception {
        String[] ret =fb.countToManyAsString(100);
        assertTrue(ret.length == 100);
        assertCountStringInArray(ret, "fizz", 27);
        assertCountStringInArray(ret, "buzz", 14);
        assertCountStringInArray(ret, "fizz buzz", 6);
        assertEquals("buzz",ret[99]);
    }
}

