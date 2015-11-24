package com.epam.javauniversity.hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Human[] humans = new Human[5];
        humans[0] = new Human("Alex", new Date(Date.UTC(1990, 1, 6, 0, 0, 0)), "0000000001");
        humans[1] = new Human("John", new Date(Date.UTC(1991, 1, 1, 0, 0, 0)), "0000000002");
        humans[2] = new Human("Michael", new Date(Date.UTC(1989, 1, 7, 0, 0, 0)), "00000000003");
        humans[3] = new Human("Stew", new Date(Date.UTC(1990, 2, 25, 0, 0, 0)), "00000000004");
        humans[4] = new Human("Bob", new Date(Date.UTC(1994, 1, 1, 0, 0, 0)), "00000000005");

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human firstHuman, Human secondHuman) {
                return firstHuman.getBirthDate().compareTo(secondHuman.getBirthDate());
            }
        });

        printHumans(humans);

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human firstHuman, Human secondHuman) {
                return firstHuman.getName().compareTo(secondHuman.getName());
            }
        });

        printHumans(humans);
    }

    private static void printHumans(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].toString());
        }
        System.out.println();
    }
}
