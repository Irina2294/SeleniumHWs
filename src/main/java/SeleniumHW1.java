import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHW1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("the title of the webpage is: " + title);
        System.out.println("the url of the webpage is" + url);
    }
}