package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDelitionTests extends TestBase {

    @Test
    public void testContactDelition(){
        if(!app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("test2","test2","test2","test@test.ru","123456"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().confirmDelition();
        app.getContactHelper().goToHomePage();
    }
}
