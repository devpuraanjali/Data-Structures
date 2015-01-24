package com.devpura.anjali.codingbat;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anjali on 1/24/15.
 */
public class ArrayQuestionsTest {

    @Test
    public void mod10StraightCase() {
        int[] input = new int[]{1,2,10,3,20,5};
        int[] expectedOutput = new int[]{1,2,10,10,20,20};
        ArrayQuestions aq = new ArrayQuestions();
        int[] result = aq.multiple10(input);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void mod10NegativeCase() {
        int[] input = new int[]{};
        int[] expectedOutput = new int[]{};
        ArrayQuestions aq = new ArrayQuestions();
        int[] result = aq.multiple10(input);

        Assert.assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void mod10NegativeCase_passNull() {
        try {
            ArrayQuestions aq = new ArrayQuestions();
            int[] result = aq.multiple10(null);
            Assert.fail("Code should have thrown an exception");
        } catch (RuntimeException ex) {

        }


    }
}
