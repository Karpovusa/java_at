package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactModifyTests extends TestBase {

    @Test
    public void testContactModify(){

        if(!app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("test22","test2","test2","test@test.ru","123456"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size()-1);
        app.getContactHelper().contactEdit();
        app.getContactHelper().editContactForm("changeName");
        app.getContactHelper().updateContactData();
        app.getContactHelper().goToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());
    }
}
