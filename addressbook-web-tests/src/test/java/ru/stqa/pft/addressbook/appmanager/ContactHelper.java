package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;


public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(contactData.getNickName());
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys();
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhone());

    }

    public void editContactForm(String firstName) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(firstName);
    }

    public void submitContactForm() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void addNewContact() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void goToHomePage() {
        wd.findElement(By.linkText("home")).click();
    }

    public void selectContact(int index) {wd.findElements(By.name("selected[]")).get(index).click();}

    public void deleteContact() {wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();}

    public void confirmDelition() {wd.switchTo().alert().accept();}

    public void contactEdit() {wd.findElement(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img")).click();}

    public void updateContactData() {wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();}

    public void createContact(ContactData contact) {
        addNewContact();
        fillContactForm(contact);
       submitContactForm();
       goToHomePage();
    }

    public boolean isThereContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int GetContactCount() {
        return wd.findElements(By.name("selected[]")).size();

    }
    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element:elements){
            List<WebElement> cells = element.findElements(By.tagName("td"));

                String name = cells.get(1).getText();
                String lastName = cells.get(2).getText();
                ContactData contact = new ContactData(name,lastName,null,null,null);
                contacts.add(contact);


        }

        return contacts;


    }
}