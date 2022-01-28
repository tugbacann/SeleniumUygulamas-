package com.testinium.test;
import com.testinium.driver.BaseTest;
import com.testinium.page.PuanCatalog;
import org.junit.Test;

public class PuanCatalogTest extends BaseTest {

    @Test
    public void puanCatAndClasic(){
        PuanCatalog puanCatalog = new PuanCatalog();
        puanCatalog.puanAndClasic();
    }
}
