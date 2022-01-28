package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ShoppingCart;
import org.junit.Test;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void shoppingCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.goToShoppingCart();
    }
}
