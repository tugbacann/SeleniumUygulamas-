package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.BooksAndHoby;
import org.junit.Test;

public class BooksAndHobyTest extends BaseTest {

    @Test
    public void booksAndHobyTest(){
        BooksAndHoby booksAndHoby = new BooksAndHoby();
        booksAndHoby.booksAndHobySelect();
    }
}
