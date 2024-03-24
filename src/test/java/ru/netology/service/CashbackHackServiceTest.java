package ru.netology.service;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void showZeroIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void show100IfAmount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void show1000IfAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        org.junit.Assert.assertEquals(actual, expected);
    }
}