package com.stateauto.test;

import com.stateauto.FizzBuzz;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by wea3765 on 3/28/2017.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void countToOneTest() throws Exception{
       int ret= fb.countToOne();
       assertEquals(1,ret);
    }

    @Test
    public void countToTwoTest() throws Exception{
        int[] ret= fb.countToTwo();
        assertEquals(1,ret[0]);
        assertEquals(2,ret[1]);
    }
//    @Test
//    public void countToManyTest() throws Exception{
//        int ret= fb.countToMany(100);
//        assertEquals(100,ret);
//
//    }
}

