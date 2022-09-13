package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CashbackHackerTest {

    @Test
    void shouldWriteAmountBeforeBoundary() {
        CashbackHacker service = new CashbackHacker();
        int expected = 200;
        int actual = service.remain(800);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldWriteAmountAfterBoundary() {
        CashbackHacker service = new CashbackHacker();
        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(actual, expected);
    }

    @Test
    
        void shouldWriteAmountIsBoundary() {
        CashbackHacker service = new CashbackHacker();
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

}
