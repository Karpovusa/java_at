package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreateTests extends TestBase{



    @Test
    public void testContactCreation () {
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm(new ContactData("test2","test2","test2","test@test.ru","123456"));
        app.getContactHelper().submitContactForm();
        app.getContactHelper().goToHomePage();
    }


}