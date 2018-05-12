package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModifyTests extends TestBase {

    @Test
    public void testGroupModify() {

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().groupEdit();
        app.getGroupHelper().fillGroupForm(new GroupData("change1","change2","change3"));
        app.getGroupHelper().updateGroupData();
        app.getGroupHelper().returnToGroupPage();
    }
}