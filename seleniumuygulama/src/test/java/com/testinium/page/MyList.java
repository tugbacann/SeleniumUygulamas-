package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class MyList {

    Methods methods;

    public MyList(){
        methods = new Methods();
    }

    public void myListSelect(){
        methods.hover(By.xpath("//div[@class='menu top my-list']")); // listelerime git
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']")); // listelerim>favorilere git
        methods.waitBySeconds(1);
        methods.deleteProductFavourite(); //favoriden ürün silme
        methods.waitBySeconds(1);
    }

}
