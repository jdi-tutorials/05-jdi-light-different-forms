package com.jdi.test.data;

import jdisite.entities.ContactInfo;
import jdisite.entities.User;

public class DefaultDataProvider {
    public static User ROMAN = new User().set(c -> {
        c.name = "Roman";
        c.password = "Jdi1234";}
    );
    public static User ALEX = new User().set(c -> c.name = "Alexander" );

    public static ContactInfo SIMPLE_CONTACT = new ContactInfo().set(c -> {
        c.name = "Roman";
        c.lastName = "Iovlev";
        c.position = "ChiefQA";
        c.passportNumber = "4321";
        c.passportSeria = "123456";
        c.description = "JDI - awesome UI autoamtion tool"; }
    );

    public static ContactInfo FULL_CONTACT = new ContactInfo().set(c -> {
        c.name = "Roman";
        c.lastName = "Full Contact";
        c.position = "ChiefQA";
        c.passportNumber = "4321";
        c.passportSeria = "123456";
        c.description = "JDI - awesome UI automation tool";

        c.gender = "Female";
        c.religion = "Other";
        c.weather = "Sun, Snow";
        c.acceptConditions = "true"; }
    );
}
