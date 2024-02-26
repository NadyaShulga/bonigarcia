import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver driver;

    @Test
    public void start(){
        driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        //driver.navigate().to("");
        driver.navigate().back();

        driver.close(); //close tab
        driver.quit();  //close all tab & browser
    }

}
