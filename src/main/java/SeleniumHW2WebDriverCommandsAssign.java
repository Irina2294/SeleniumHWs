import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW2WebDriverCommandsAssign {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        String title=driver.getTitle();
        System.out.println("The title for google page is: "+ title);
        driver.navigate().to("https://www.syntaxprojects.com/");
        String SyntaxTitle=driver.getTitle();
        System.out.println("Syntaxprojects title is: "+SyntaxTitle);
        driver.navigate().back();
        driver.quit();


    }
}
