package com.epam.javauniversity.hw5;

import java.util.Date;

public class Man implements Comparable {
    private final String name;
    private final Date birthDate;
    private String id;

    public Man(String name, Date birthDate, String id) {
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

    @Override
    public int compareTo(Object man) {
        if (man == null) {
            return -1;
        }
        Man firstMan = this;
        Man secondMan = (Man) man;
        if (secondMan.birthDate.compareTo(firstMan.birthDate) > 0) {
            return 1;
        } else {
            if (firstMan.birthDate.compareTo(secondMan.birthDate) == 0) {
                if (firstMan.id.compareTo(secondMan.id) > 0) {
                    return 1;
                } else {
                    if (firstMan.id.compareTo(secondMan.id) == 0) {
                        if (firstMan.name.compareTo(secondMan.name) > 0) {
                            return 1;
                        } else {
                            if (firstMan.name.compareTo(secondMan.name) == 0) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
