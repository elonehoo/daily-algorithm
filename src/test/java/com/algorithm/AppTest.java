package com.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
