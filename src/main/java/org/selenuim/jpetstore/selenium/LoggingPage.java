package org.selenuim.jpetstore.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoggingPage extends JPetStorePage {

  public LoggingPage(WebDriver driver) {
    super(driver);
  }

  private WebElement username = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[1]"));

  private WebElement password = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]"));

  private WebElement btnLogging = driver.findElement(By.xpath("//*[@id=\\\"Catalog\\\"]/form/input"));

  public HomePage loggin() {
    username.sendKeys("ACID");
    password.sendKeys("ACID");
    btnLogging.click();
    return PageFactory.initElements(driver, HomePage.class);
  }

}
