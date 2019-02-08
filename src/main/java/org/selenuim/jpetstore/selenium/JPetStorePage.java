package org.selenuim.jpetstore.selenium;

import org.openqa.selenium.WebDriver;

public abstract class JPetStorePage {

  public WebDriver driver;

  public JPetStorePage(WebDriver driver) {
    super();
    this.driver = driver;
  }

}
