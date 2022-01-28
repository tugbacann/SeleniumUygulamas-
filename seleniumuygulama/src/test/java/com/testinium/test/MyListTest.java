package com.testinium.test;
import com.testinium.driver.BaseTest;
import com.testinium.page.MyList;
import org.junit.Test;

public class MyListTest extends BaseTest {

    @Test
    public void MyListTest(){
        MyList myList = new MyList();
        myList.myListSelect();
    }
}
