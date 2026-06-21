package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    void testAddition() {
        int result = 10 + 20;
        assertEquals(30, result);
    }
}