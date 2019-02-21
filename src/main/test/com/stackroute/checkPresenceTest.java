package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class checkPresenceTest {
    checkPresence pre ;
    @Before
    public void setUp() throws Exception {
        pre= new checkPresence();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        boolean expected=true;
        boolean actual=pre.harry("This is Harry");

        assertEquals(expected,actual);
    }
    @Test
    public void check1() {
        boolean expected=false;
        boolean actual=pre.harry("This is Henry");

        assertEquals(expected,actual);
    }


}