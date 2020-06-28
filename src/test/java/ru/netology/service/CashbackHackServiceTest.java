package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shoulRemainByAmount999() {
        int amount = 999;
        int expected = 1;
        assertEquals(service.remain(amount), expected);
    }

    @org.testng.annotations.Test
    public void shoulRemainByAmount1000() {
        int amount = 1000;
        int expected = 0;
        assertEquals(service.remain(amount), expected);
    }

    @org.testng.annotations.Test
    public void shoulRemainByAmount1001() {
        int amount = 1001;
        int expected = 999;
        assertEquals(service.remain(amount), expected);
    }
}