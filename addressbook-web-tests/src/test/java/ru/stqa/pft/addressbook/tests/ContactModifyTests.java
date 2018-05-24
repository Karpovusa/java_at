package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModifyTests extends TestBase {

    @Test
    public void testContactModify(){
        if(!app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("test2","test2","test2","test@test.ru","123456"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().contactEdit();
        app.getContactHelper().editContactForm("changeName");
        app.getContactHelper().updateContactData();
        app.getContactHelper().goToHomePage();
    }
}
