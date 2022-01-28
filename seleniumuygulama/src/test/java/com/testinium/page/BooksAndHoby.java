package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;


public class BooksAndHoby {

    Methods methods;

    public BooksAndHoby(){
        methods = new Methods();
    }

    public void booksAndHobySelect(){
        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and text()='Tüm Kitaplar']")); //tüm kitaplar>hobi seç
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[@href='kategori/kitap-hobi/1_212.html' and text()='Hobi']")); //tüm kitaplar>hobi seç
        methods.waitBySeconds(1);
        methods.randomSelect(By.xpath("//a[@class='pr-img-link']")); // random ürün seç
        methods.waitBySeconds(1);
        methods.click(By.xpath("//span[contains(text(),'Sepete Ekle')]")); // seçileni sepete ekle
        methods.waitBySeconds(1);
    }
}
