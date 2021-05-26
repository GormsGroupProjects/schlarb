package org.schlarb.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.schlarb.utility.Utility;

public class UtilityTest {

    @Test
    public void testGetMethodName() {
        Assertions.assertEquals("org.schlarb.test.UtilityTest.testGetMethodName", Utility.getMethodName());
    }
}
