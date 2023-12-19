package com.example.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ServletAnswerTest {

    ServletAnswer c;

    @BeforeEach
    void setUp() {
        c = new ServletAnswer();
    }

    @Test
    public void dados_dos_numeros_resta_ok(){
        System.out.println("test 1");
        assertEquals(6, c.restar(10, 4), 0);
    }

}