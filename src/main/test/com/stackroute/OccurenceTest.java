package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceTest {

    Occurence ocr;
    @Before
    public void setUp() throws Exception {
        ocr= new Occurence();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        int expected=10;
        int actual=ocr.countOccurence("Java is java again java again");

        assertEquals(expected,actual);
    }

}
