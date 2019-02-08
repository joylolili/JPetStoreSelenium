package org.selenuim.jpetstore.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends JPetStorePage {

  public OrderPage(WebDriver driver) {
    super(driver);
    // TODO Auto-generated constructor stub
  }

  private WebElement btnContinue = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));

  public void confirmer() {
    btnContinue.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement btnConfirm = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
    btnConfirm.click();
  }
}
