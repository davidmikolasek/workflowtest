package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMinTest {
@Test
    public void testjedna() {
    int x = 4;
    int y = 8;
    assertEquals(MyMin.min(x,y), 4);
}
}