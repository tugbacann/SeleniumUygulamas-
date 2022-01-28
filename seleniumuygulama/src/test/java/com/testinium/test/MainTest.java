package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.*;
import org.junit.Test;

public class MainTest extends BaseTest {

    @Test
    public void mainTest(){
        HomePage homePage = new HomePage();
        homePage.home();

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        SearchAndFavorites searchAndFavorites = new SearchAndFavorites();
        searchAndFavorites.searchAndAddToFavorites();

        PuanCatalog puanCatalog = new PuanCatalog();
        puanCatalog.puanAndClasic();

        BooksAndHoby booksAndHoby = new BooksAndHoby();
        booksAndHoby.booksAndHobySelect();

        MyList myList = new MyList();
        myList.myListSelect();

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.goToShoppingCart();
    }
}
