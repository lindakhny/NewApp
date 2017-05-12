package com.example.android.newapp;

import java.io.Serializable;

/**
 * Created by lindakhny on 12/05/2017.
 */

public class SerializableClass implements Serializable {
    private String firstName;
    private String lastName;
    // stupid example for transient

    public SerializableClass(){}

    public SerializableClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName
                + "]";
    }
}