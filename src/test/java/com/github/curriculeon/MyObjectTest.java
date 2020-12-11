package com.github.curriculeon;

import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

public class MyObjectTest {

    @Test
    public void regexTest() {
        new RegexTutorial().run();
    }

    @Test
    public void jsonTest() {
        Person leon = new Person(0L, "Leon", 27);
        Person bob = new Person(0L, "Bob", 28);
        Person chris = new Person(0L, "Chris", 29);
        Person noel = new Person(0L, "Noel", 30);
        Arrays.asList(leon, bob, chris, noel).forEach(person -> System.out.print(person.json()));
        Arrays.asList(leon, bob, chris, noel).forEach(person -> System.out.print(person.json()));
        Arrays.asList(leon, bob, chris, noel).forEach(person -> System.out.print(person.json()));
    }

    @Test
    public void licenseTest() {
        License license = new LicenseBuilder()
                .setEndorsement('C')
                .setId("0L")
                .setExpirationDate(new Date())
                .setBirthDate(new Date())
                .createLicense();
    }
}