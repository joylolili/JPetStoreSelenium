package org.selenuim.jpetstore.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class InitPage extends JPetStorePage {

  public InitPage(WebDriver driver) {
    super(driver);
  }

  private WebElement linkEnterStore = driver.findElement(By.xpath("//a"));

  public HomePage clickOnLinkEnterSotre() {
    linkEnterStore.click();
    return PageFactory.initElements(driver, HomePage.class);
  }
}
