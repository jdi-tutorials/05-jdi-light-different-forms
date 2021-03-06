package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedIn;
import static com.jdi.test.data.DefaultDataProvider.FULL_CONTACT;
import static com.jdi.test.data.DefaultDataProvider.SIMPLE_CONTACT;
import static jdisite.JDISite.*;
import static jdisite.enums.MenuOptions.ContactForm;
import static jdisite.pages.ContactPage.contactForm;

public class JdiContactForm implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        sideMenu.select(ContactForm);
    }
    @Test
    public void submitContactFormTest() {
        contactPage.checkOpened();
        contactForm.submit(FULL_CONTACT);
        contactForm.check(FULL_CONTACT);
    }
    @Test
    public void simpleContactFormTest() {
        contactPage.checkOpened();
        contactForm.submit(SIMPLE_CONTACT);
        contactForm.check(SIMPLE_CONTACT);
    }
    // Light ContactForm Example
    @Test
    public void lightContactFormTest() {
        contactPage.checkOpened();
        lightContactForm.submit(SIMPLE_CONTACT);
        lightContactForm.check(SIMPLE_CONTACT);
    }
}
