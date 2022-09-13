package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {

    @Test
    public void shouldWriteAmountBeforeBoundary() {
        CashbackHacker service = new CashbackHacker();
        int expected = 200;
        int actual = service.remain(800);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldWriteAmountAfterBoundary() {
        CashbackHacker service = new CashbackHacker();
        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldWriteAmountIsBoundary() {
        CashbackHacker service = new CashbackHacker();
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }


}
