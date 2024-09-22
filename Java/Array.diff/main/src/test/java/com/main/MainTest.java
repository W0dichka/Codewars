package com.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void sampleTests() {
      assertArrayEquals(new int[] {2}, Main.arrayDiff(new int [] {1,2}, new int[] {1}));
      assertArrayEquals(new int[] {2,2}, Main.arrayDiff(new int [] {1,2,2}, new int[] {1}));
      assertArrayEquals(new int[] {1}, Main.arrayDiff(new int [] {1,2,2}, new int[] {2}));
      assertArrayEquals(new int[] {1,2,2}, Main.arrayDiff(new int [] {1,2,2}, new int[] {}));
      assertArrayEquals(new int[] {}, Main.arrayDiff(new int [] {}, new int[] {1,2}));
    }
}
