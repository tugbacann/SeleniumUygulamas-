package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List; //elementler fonksiyonu
import java.util.Random;

import static com.testinium.driver.BaseTest.driver;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods(){
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by){
        findElement(by).click();
    }

    public void waitBySeconds(long seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by){ //?
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

    public void scrollWithAction(By by){ //mouse ve klavye işlemleri için
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void scrollWithJavaScript(By by){ //javascript ile scroll
        jsdriver.executeScript("arguments[0].scrollIntoView();", findElement(by));
    }

    public Select getSelect(By by){

        return new Select(findElement(by));
    }

    public void selectByText(By by, String text){

        getSelect(by).selectByVisibleText(text);
    }

    public List<WebElement> findAll(By by){  //Elementler Fonsiyonu
        return driver.findElements(by);
    }

    public void randomSelect(By by) { //random seçme
        Random rand = new Random();
        findAll(by).get(rand.nextInt(findAll(by).size())).click();
    }

    public void hover(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).perform(); // üstüne gelince işlemi yaptır
    }

    public void selectProduct(By by, int index){ //favorilere ürün eklemede kullan
        findAll(by).get(index).click();
    }

    public void inputReset(By by){
        findElement(by).clear();
    }

    public void deleteProductFavourite() { // favorilerden ürün silmek
        driver.findElement(By.xpath("//div[@class='hover-menu']/a[3]")).click();
    }

   public String getText(By by){
        return findElement(by).getText();
    }

    /*public void orderControl() {
        String order = getText(By.cssSelector(".warning"));
    }
     */

}
