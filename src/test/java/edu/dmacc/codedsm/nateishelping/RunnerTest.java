package edu.dmacc.codedsm.nateishelping;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {
    private Runner classUnderTest;

    @Before
    public void setUp() throws Exception {

        classUnderTest = new Runner();

    }

    @Test
    public void shouldAdd() {

        int result = classUnderTest.addInt(4, 9);
        assertEquals(15, result);

    }

    @Test
    public void addInt() {
    }

    @Test
    public void shouldSubtract() {

        int result = classUnderTest.subtractInt(8, 4);
        assertEquals(9, result);

    }

    @Test
    public void subtractInt(){

    }
}