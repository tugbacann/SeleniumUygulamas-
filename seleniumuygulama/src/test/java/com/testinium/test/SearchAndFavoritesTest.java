package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.SearchAndFavorites;
import org.junit.Test;

public class SearchAndFavoritesTest extends BaseTest {

    @Test
    public void searchAndFavoriteTest(){
        SearchAndFavorites searchAndFavorites = new SearchAndFavorites();
        searchAndFavorites.searchAndAddToFavorites();
    }
}
