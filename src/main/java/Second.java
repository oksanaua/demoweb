import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup(); //запуск драйвера

        FirefoxDriver driver = new FirefoxDriver(); //открытие браузера

        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/"); //открытие вебстраницы сайта

        System.out.println(driver.getTitle()); //вывод названия страницы в консоль и с возможностью записи в переменную

        Thread.sleep(3000);
        driver.quit();

    }
}
