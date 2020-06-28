package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJUnitTest {
    private CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainByAmount999() {
        int amount = 999;
        int expected = 1;
        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void shouldRemainByAmount1000() {
        int amount = 1000;
        int expected = 0;
        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void shouldRemainByAmount1001() {
        int amount = 1001;
        int expected = 999;
        assertEquals(expected, service.remain(amount));
    }
}