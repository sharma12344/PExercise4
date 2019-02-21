package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchTest
{
    Match mch ;
    @Before
    public void setUp() throws Exception {
        mch= new Match();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected="4-6 10-12 27-29";
        String actual=mch.findIndex("She sells seashells by the seashore","se");

        assertEquals(expected,actual);
    }

}
