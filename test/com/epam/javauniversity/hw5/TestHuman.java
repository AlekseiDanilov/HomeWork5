package com.epam.javauniversity.hw5;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TestHuman {
    @Test
    public void testHumanAgeFirstMoreSecond() {
        Date dateFirstHuman = new Date(Date.UTC(1990, 1, 1, 0, 0, 0));
        Date dateSecondHuman = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertTrue(new Human("Alex", dateFirstHuman, "1").compareTo(
                     new Human("Alex", dateSecondHuman, "1")) > 0);
    }

    @Test
    public void testHumanAgeFirstLessSecond() {
        Date dateFirstHuman = new Date(Date.UTC(1992, 1, 1, 0, 0, 0));
        Date dateSecondHuman = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertTrue(new Human("Alex", dateFirstHuman, "1").compareTo(
                     new Human("Alex", dateSecondHuman, "1")) < 0);
    }

    @Test
    public void testHumanFirstEqualsSecond() {
        Date dateFirstHuman = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        Date dateSecondHuman = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertEquals(new Human("Alex", dateFirstHuman, "1").compareTo(
                     new Human("Alex", dateSecondHuman, "1")), 0);
    }

    @Test
    public void testHumanIdFirstMoreSecond() {
        Date dateFirstHuman = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        Date dateSecondHuman = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        assertTrue(new Human("Alex", dateFirstHuman, "2").compareTo(
                new Human("Alex", dateSecondHuman, "1")) > 0);
    }

    @Test
    public void testHumanFirstLessSecond() {
        Date dateFirstHuman = new Date(Date.UTC(1991, 1, 1, 0, 0, 0));
        Date dateSecondHuman = new Date(Date.UTC(1992, 1, 1, 0, 0, 0));
        assertTrue(new Human("John", dateFirstHuman, "2").compareTo(
                new Human("Alex", dateSecondHuman, "1")) > 0);
    }
}