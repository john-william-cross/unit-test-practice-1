package edu.dmacc.codedsm.nateishelping;

import org.junit.Before;
import org.junit.Test;

import static edu.dmacc.codedsm.nateishelping.PayrollTaxCalculator.calculateNetPay;
import static org.junit.Assert.*;

public class PayrollTaxCalculatorTest {
    private PayrollTaxCalculator classUnderTest;


    @Before
    public void setUp() throws Exception {

        classUnderTest = new PayrollTaxCalculator();

    }

    @Test
    public void shouldCalculateNetPay() {
        double result = calculateNetPay(5.32);
        assertEquals(4.433333333333334, result, .00);
    }
}