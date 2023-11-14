package de.telran.g_10_170123_e_be_ci.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    private NumberService service;

    @BeforeEach
    public void init() {
        service = new NumberService();
    }

    @Test
    public void checkNumber() {
        int expected = 14;
        int actual = service.getDoubledNumber();
        assertEquals(expected, actual);
    }
}