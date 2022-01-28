package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class PuanCatalog {

    Methods methods;

    public PuanCatalog(){
        methods = new Methods();
    }

    public void puanAndClasic() {
        methods.click(By.cssSelector(".logo-icon")); //anasayfaya dönülür
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".lvl1catalog")); // puan kataloğuna gidilir
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.cssSelector(".carousel-title")); // türk klasiklerini görmek için ekran kaydırılır
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("[src='https://img.kitapyurdu.com/v1/getImage/fn:4359433/wh:14a4e2d16']")); // türk klasiklerine gidilir
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[onchange='location = this.value;']"),"Yüksek Oylama"); //sıralama için
        methods.waitBySeconds(1);
    }
}
