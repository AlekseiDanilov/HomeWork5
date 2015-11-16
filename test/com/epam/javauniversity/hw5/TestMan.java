package com.epam.javauniversity.hw5;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TestMan {
    @Test
    public void testManAgeFirstMoreSecond() {
        Date dateFirstMan = new Date(Date.UTC(1990, 1, 1, 0, 0, 0));
        Date dateSecondMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertEquals(new Man("Alex", dateFirstMan, "1").compareTo(
                     new Man("Alex", dateSecondMan, "1")), 1);
    }

    @Test
    public void testManAgeFirstLessSecond() {
        Date dateFirstMan = new Date(Date.UTC(1992, 1, 1, 0, 0, 0));
        Date dateSecondMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertEquals(new Man("Alex", dateFirstMan, "1").compareTo(
                     new Man("Alex", dateSecondMan, "1")), -1);
    }

    @Test
    public void testManFirstEqualsSecond() {
        Date dateFirstMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        Date dateSecondMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertEquals(new Man("Alex", dateFirstMan, "1").compareTo(
                     new Man("Alex", dateSecondMan, "1")), 0);
    }

    @Test
    public void testManNameFirstMoreSecond() {
        Date dateFirstMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        Date dateSecondMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertEquals(new Man("John", dateFirstMan, "1").compareTo(
                     new Man("Alex", dateSecondMan, "1")), 1);
    }

    @Test
    public void testManIdFirstMoreSecond() {
        Date dateFirstMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        Date dateSecondMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertEquals(new Man("Alex", dateFirstMan, "2").compareTo(
                new Man("Alex", dateSecondMan, "1")), 1);
    }

    @Test
    public void testManFirstLessSecond() {
        Date dateFirstMan = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        Date dateSecondMan = new Date(Date.UTC(1992, 1, 1, 0, 0, 0));
        assertEquals(new Man("John", dateFirstMan, "2").compareTo(
                new Man("Alex", dateSecondMan, "1")), 1);
    }
}