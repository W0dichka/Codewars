package com.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void sampleTests() {
      assertEquals("579", App.sumStrings("123", "456"));
      assertEquals("111111111111111111111111111111", App.sumStrings("111111111111111111111111111110", "1"));
      assertEquals("529", App.sumStrings("529", "0"));
      assertEquals("529", App.sumStrings("0", "529"));
    }
}
