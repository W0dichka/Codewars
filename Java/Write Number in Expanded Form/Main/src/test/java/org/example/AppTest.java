package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest{
    @Test
    public void sampleTests() {
        assertEquals("500 + 70 + 9", App.expandedForm(579));
        assertEquals("0", App.expandedForm(0));
        assertEquals("9000000", App.expandedForm(9000000));
        assertEquals("6000000 + 300000 + 80000 + 7000 + 300 + 40 + 9", App.expandedForm(6387349));
    }
}
