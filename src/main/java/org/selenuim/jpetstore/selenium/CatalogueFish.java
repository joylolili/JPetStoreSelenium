package org.selenuim.jpetstore.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CatalogueFish extends JPetStorePage {

  public CatalogueFish(WebDriver driver) {
    super(driver);
    // TODO Auto-generated constructor stub
  }

  private WebElement choix = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));

  public OrderPage clickOnChoix() {
    choix.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement choixSuite = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
    choixSuite.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement btnProcedee  = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));;
    btnProcedee.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return PageFactory.initElements(driver, OrderPage.class);
  }
}
