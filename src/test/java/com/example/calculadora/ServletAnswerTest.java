package com.example.calculadora;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ServletAnswerTest {

    ServletAnswer c;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Setup Class");
    }

    @Before
    public void setUp() {
        c = new ServletAnswer();
    }

    @Test
    public void dados_dos_numeros_resta_ok(){
        System.out.println("test 1");
        assertEquals(6, c.restar(10, 4), 0);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Tear down Class()");
    }
}