package Pages;

import Basis.BasicOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverviewPage extends BasicOperations {

    public WebElement logo = driver.findElement(By.xpath("//*[@id=\"header\"]/div/a/img[1]"));
    public WebElement cartlink = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/a/span[2]"));
    public WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"search\"]"));
    public WebElement homeAndDecorbtn = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/a/img"));
    public WebElement shopPrivateSales = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/a/img"));
    public WebElement travelGear = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/ul/li[3]/a/img"));
    public WebElement newsletter = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
    public WebElement subscribeBtn = driver.findElement(By.xpath("//*[@id=\"newsletter-validate-detail\"]/div/div[3]/button/span/span"));
    public WebElement accountlink = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a"));
    public WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[1]/a"));
    public WebElement myWishList = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[2]/a"));
    public WebElement myCart = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[3]/a"));
    public WebElement checkout = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[4]/a"));
    public WebElement register = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[5]/a"));
    public WebElement login = driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[6]/a"));

    public void accessRegistrationPage() {

        accountlink.click();
        register.click();

    }

    public void accessLoginPage() {

        accountlink.click();
        login.click();
    }
}

