package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
    public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();

    
     driver.get("https://www.getcalley.com/page-sitemap.xml");

    }
}