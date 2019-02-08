package org.selenuim.jpetstore.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends JPetStorePage {

  public HomePage(WebDriver driver) {
    super(driver);
  }

  private WebElement signIn = driver.findElement(By.xpath("//a[.=\"Sign In\"]"));
  
  
  
  

  public void clickSignIn() {
	signIn.click();
    
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement username = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[1]"));
	
	WebElement password = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]"));
	
	WebElement btnLogging = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
	
	username.sendKeys("ACID");
	password.clear();
    password.sendKeys("ACID");
    btnLogging.click();
	
  }

  public CatalogueFish clickOnFish() {
	WebElement linkFish = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img"));
    linkFish.click();
    return PageFactory.initElements(driver, CatalogueFish.class);

  }

  public void logout() {
    signIn.click();
  }

}
