package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldRemainByAmount999() {
        int amount = 999;
        int expected = 1;
        assertEquals(expected, service.remain(amount));
    }

    @org.junit.Test
    public void shouldRemainByAmount1000() {
        int amount = 1000;
        int expected = 0;
        assertEquals(expected, service.remain(amount));
    }

    @org.junit.Test
    public void shouldRemainByAmount1001() {
        int amount = 1001;
        int expected = 999;
        assertEquals(expected, service.remain(amount));
    }
}