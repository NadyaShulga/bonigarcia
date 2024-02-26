import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebForm {

    WebDriver driver;

    @BeforeClass
    public void preCondition() {
    driver = new ChromeDriver();
    driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        //open browser
        //open site
    }
    @Test
    public void inputTest(){
    driver.findElement(By.cssSelector("#my-text-id")).click();
    }


    @AfterClass
    public void postCondition(){

        //driver.close();
    }
    }

