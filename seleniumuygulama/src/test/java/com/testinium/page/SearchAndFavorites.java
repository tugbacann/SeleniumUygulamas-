package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;


public class SearchAndFavorites {

    Methods methods;

    public SearchAndFavorites() {
        methods = new Methods();
    }

    public void searchAndAddToFavorites(){
        methods.sendKeys(By.id("search-input"), "oyuncak"); //arama motoruna text gir
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".common-sprite.button-search")); //arama butonuna tıkla
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("//div[@class='product-cr'][7]")); // oyuncaklar sayfasında scroll 7 kadar gelsin
        methods.waitBySeconds(1);

        for (int i=7; i<11; i++) { //favorilere ekleme
            methods.selectProduct(By.cssSelector(".add-to-favorites"), i);
            methods.waitBySeconds(1);
        }
    }
}
