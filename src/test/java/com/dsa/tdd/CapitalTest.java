package com.dsa.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalTest {

    @Test
    public void testEmpty()
    {
        Capital cap = new Capital();
        String output = cap.toCapital("");

        assertEquals("",output);
    }

    @Test
    public void testNull()
    {
        Capital cap = new Capital();
        String output = cap.toCapital(null);

        assertEquals("",output);
    }

    @Test
    public void testSingleWord()
    {
        Capital cap = new Capital();
        String output = cap.toCapital("apple");

        assertEquals("Apple",output);
    }

    @Test
    public void testMultipleWords()
    {
        Capital cap = new Capital();
        String output = cap.toCapital("apple banana");

        assertEquals("Apple Banana",output);
    }

}
