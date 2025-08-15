package com.common.collection.map;

import java.util.Objects;

public class PhoneBook {
    private String name;
    private String number;

    public PhoneBook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,number);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof PhoneBook)) return false;
        PhoneBook pb = (PhoneBook) obj;
        return name.equals(pb.name) && Objects.equals(number, pb.number);
    }
}
