package com.example.demo;

import org.junit.jupiter.api.Test;

import java.awt.datatransfer.StringSelection;

import static org.junit.jupiter.api.Assertions.*;

class StringProblemTest {

    @Test
    void konkatekan() {
        StringProblem stringPr1 = new StringProblem("I want", "Pizza");
        stringPr1.konkatekan();
        assertEquals("I want Pizza", stringPr1.result);
        StringProblem stringPr2 = new StringProblem("str");
        stringPr2.konkatekan();
        assertEquals("str ", stringPr2.result);
    }

    @Test
    void stringTimes() {
        StringProblem stringPr1 = new StringProblem("I want", 3);
        stringPr1.stringTimes();
        assertEquals("I wantI wantI want", stringPr1.result);
        StringProblem stringPr2 = new StringProblem("str", 3);
        stringPr2.stringTimes();
        assertEquals("strstrstr", stringPr1.result);
    }
}