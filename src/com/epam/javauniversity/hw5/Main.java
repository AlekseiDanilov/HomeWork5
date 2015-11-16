package com.epam.javauniversity.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Man[] mans = new Man[5];
        mans[0] = new Man("Alex", new Date(Date.UTC(1990, 1, 6, 0, 0, 0)), "0000000001");
        mans[1] = new Man("John", new Date(Date.UTC(1991, 1, 1, 0, 0, 0)), "0000000002");
        mans[2] = new Man("Michael", new Date(Date.UTC(1989, 1, 7, 0, 0, 0)), "00000000003");
        mans[3] = new Man("Stew", new Date(Date.UTC(1990, 2, 25, 0, 0, 0)), "00000000004");
        mans[4] = new Man("Bob", new Date(Date.UTC(1994, 1, 1, 0, 0, 0)), "00000000005");

        Arrays.sort(mans, new Comparator<Man>() {
            @Override
            public int compare(Man firstMan, Man secondMan) {
                return firstMan.getBirthDate().compareTo(secondMan.getBirthDate());
            }
        });

        printMans(mans);

        Arrays.sort(mans, new Comparator<Man>() {
            @Override
            public int compare(Man firstMan, Man secondMan) {
                return firstMan.getName().compareTo(secondMan.getName());
            }
        });

        printMans(mans);
    }

    private static void printMans(Man[] mans) {
        for (int i = 0; i < mans.length; i++) {
            System.out.println(mans[i].getName() + " " +
                    mans[i].getBirthDate().getYear() + "." + mans[i].getBirthDate().getMonth() + "." + mans[i].getBirthDate().getDate() + " " +
                    mans[i].getId());
        }
        System.out.println();
    }
}
