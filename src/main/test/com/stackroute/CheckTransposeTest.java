package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CheckTransposeTest {

    CheckTranspose transpose;

    @Before
    public void setUp() throws Exception {
        transpose = new CheckTranspose();
    }

    @After
    public void tearDown() throws Exception {
        transpose = null;
    }

    @Test
    public void test() throws IOException {

        String expected="a kciuq nworb xof spmuj revo eht yzal god";

        String str="a quick brown fox jumps over the lazy dog";
        String actual= transpose.outTranspose(str);
        assertEquals(expected,actual);

        assertNotNull(transpose);
    }

}