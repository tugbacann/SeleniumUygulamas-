package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ShoppingCart {

    Methods methods;
    Logger logger = LogManager.getLogger(ShoppingCart.class);

    public ShoppingCart(){
        methods = new Methods();
    }

    public void goToShoppingCart(){
        methods.click(By.id("cart")); // sepete git alanı
        methods.waitBySeconds(1);
        methods.click(By.id("js-cart")); // sepete git
        methods.waitBySeconds(1);
        methods.inputReset(By.xpath("//*[@name='quantity']")); //
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//*[@name='quantity']"),"3"); //ürün adedi arttır
        methods.waitBySeconds(1);
        methods.click(By.xpath("//i[@title='Güncelle']")); // ürün adedini güncelle
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='right']/a")); // satıl al butonu tıkla
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href='#tab-shipping-new-adress']")); // yeni adres ekleme
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//*[@id='address-firstname-companyname']"), "Tuğba"); //isim gir
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-lastname-title"), "Can"); // soyisim gir
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("select#address-country-id"),"Türkiye"); //ülke seç
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("select#address-zone-id"),"Çanakkale"); //şehir
        methods.waitBySeconds(1);
        methods.selectByText(By.id("address-county-id"),"MERKEZ");//ilçe
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("district"), "CUMHURİYET MAH (KEPEZ KÖYÜ)"); //mahalle
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-address-text"),"Cumhuriyet mahallesi yıldız caddesi No:42-44 kepez"); //adres
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-postcode"),"17100"); //posta kodu gir
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-telephone"),"2863173866"); // sabit tel
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-mobile-telephone"),"5419669338"); // cep tel
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-tax-id"),"37474086964"); //tc
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue")); // devam et
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue")); // devam et
        methods.waitBySeconds(1);

        //ödeme kart bilgileri
        methods.sendKeys(By.xpath("//*[@id='credit-card-owner']"), "Tuğba Can"); // kart sahibinin adı
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit_card_number_1"),"4546"); // kart numarası
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit_card_number_2"),"7112");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit_card_number_3"),"3456");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit_card_number_4"),"7894");
        methods.waitBySeconds(1);
        methods.selectByText(By.id("credit-card-expire-date-month"), "12"); // kart ay
        methods.waitBySeconds(1);
        methods.selectByText(By.id("credit-card-expire-date-year"), "2026"); // kart yıl
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-security-code"), "000"); // güvenlik kodu gir
        methods.waitBySeconds(1);

        methods.click(By.id("button-checkout-continue")); // devam
        methods.waitBySeconds(1);

        methods.click(By.xpath("//*[@id='terms-and-conditions-form']/div/input")); // sözleşme onayı işaretle
        methods.waitBySeconds(1);

        methods.click(By.xpath("//div[@class='right']/input")); // siparişi onayla
        //logger.info(methods.getText(By.cssSelector(".warning")));
        methods.waitBySeconds(1);


        methods.click(By.id("button-checkout-continue")); // devam et
        methods.waitBySeconds(1);


        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/']")); // anasayfaya git
        methods.waitBySeconds(1);

        methods.hover(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/account']")); // kullanıcı giriş/çıkış için profile gidilir
        methods.waitBySeconds(1);

        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/logout']")); // çıkış yap
        methods.waitBySeconds(3);

    }
}
