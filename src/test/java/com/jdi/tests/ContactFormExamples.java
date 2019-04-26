package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedIn;
import static com.jdi.states.State.loggedOut;
import static com.jdi.test.data.DefaultDataProvider.*;
import static jdisite.JDISite.*;
import static jdisite.enums.MenuOptions.ContactForm;
import static jdisite.pages.ContactPage.*;

public class ContactFormExamples implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        sideMenu.select(ContactForm);
    }

    @Test
    public void submitContactFormTest() {
        contactForm.submit(SIMPLE_CONTACT);
        contactForm.check(SIMPLE_CONTACT);
    }
    @Test
    public void submitContactFormSmartTest() {
        contactFormSmart.submit(SIMPLE_CONTACT);
        contactFormSmart.check(SIMPLE_CONTACT);
    }
    @Test
    public void lightContactFormTest() {
        lightContactForm.submit(SIMPLE_CONTACT);
        lightContactForm.check(SIMPLE_CONTACT);
    }
}
