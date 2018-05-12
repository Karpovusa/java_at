package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModifyTests extends TestBase {

    @Test
    public void testContactModify(){
        app.getContactHelper().selectContact();
        app.getContactHelper().contactEdit();
        app.getContactHelper().editContactForm("changeName");
        app.getContactHelper().updateContactData();
        app.getContactHelper().goToHomePage();
    }
}
