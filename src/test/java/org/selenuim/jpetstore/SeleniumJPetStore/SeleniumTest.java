package org.selenuim.jpetstore.SeleniumJPetStore;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenuim.jpetstore.selenium.CatalogueFish;
import org.selenuim.jpetstore.selenium.HomePage;
import org.selenuim.jpetstore.selenium.InitPage;
import org.selenuim.jpetstore.selenium.LoggingPage;
import org.selenuim.jpetstore.selenium.OrderPage;

public class SeleniumTest {

  @Test
  public void seleniumTest() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Desktop\\SUT\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://localhost:8088/jpetstore");

    InitPage initPage = new InitPage(driver);

	initPage.clickOnLinkEnterSotre();
	
    HomePage homepage = new HomePage(driver);
      
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    homepage.clickSignIn();
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    homepage.clickOnFish();
    
    CatalogueFish catalogueFish = new CatalogueFish(driver);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    catalogueFish.clickOnChoix();
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    OrderPage orderPage =  new OrderPage(driver);
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    orderPage.confirmer();
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

}
