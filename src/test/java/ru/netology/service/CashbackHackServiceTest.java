package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldRemainByAmount999() {
        int amount = 999;
        int expected = 1;
        assertEquals(service.remain(amount), expected);
    }

//    @org.testng.annotations.Test
    public void shouldRemainByAmount1000() {
        int amount = 1000;
        int expected = 0;
        assertEquals(service.remain(amount), expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainByAmount1001() {
        int amount = 1001;
        int expected = 999;
        assertEquals(service.remain(amount), expected);
    }
}