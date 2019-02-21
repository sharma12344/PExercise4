package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParaTest {

    SortPara par ;

    @Before
    public void setUp() throws Exception {
        par= new SortPara();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkWords() {
        String[] expected={"and","dance","eat","I","love","love","to","to"};
        String[] actual=par.operations("I love to dance and love to eat");


        assertArrayEquals(expected,actual);
    }

}
