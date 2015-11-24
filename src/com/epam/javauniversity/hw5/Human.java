package com.epam.javauniversity.hw5;

import java.util.Date;

public class Human {
    private final String name;
    private Date birthDate;
    private String id;

    public Human(String name, Date birthDate, String id) {
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int compareTo(Human human) {
        if (human == null) {
            return -1;
        }
        Human secondHuman = human;
        if (secondHuman.birthDate.compareTo(this.birthDate) > 0) {
            return 1;
        } else {
            if (this.birthDate.compareTo(secondHuman.birthDate) == 0) {
                if (this.id.compareTo(secondHuman.id) > 0) {
                    return 1;
                } else {
                    if (this.id.compareTo(secondHuman.id) == 0) {
                        return 0;
                    }
                }
            }
        }
        return -1;
    }

    public String toString() {
        return name + " " +
               birthDate.getYear() + "." + birthDate.getMonth() + "." + birthDate.getDate() + " " +
               id;
    }
}
