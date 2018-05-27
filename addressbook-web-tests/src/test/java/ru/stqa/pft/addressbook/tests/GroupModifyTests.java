package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupModifyTests extends TestBase {

    @Test
    public void testGroupModify() {

        app.getNavigationHelper().goToGroupPage();

        if(!app.getGroupHelper().isThereGroup()){
            app.getGroupHelper().createGroup(new GroupData("test12", null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size()-1);
        app.getGroupHelper().groupEdit();
        app.getGroupHelper().fillGroupForm(new GroupData("change1","change2","change3"));
        app.getGroupHelper().updateGroupData();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(),before.size());
    }
}