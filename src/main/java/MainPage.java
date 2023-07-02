import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/oksanashkliar/IdeaProjects/Tools/chromedriver/chromedriver");

        WebDriver webDriver = new ChromeDriver();   //  создание Webdriver

        Thread.sleep(2000);
        webDriver.manage().window().maximize(); // открыть браузер во весь экран

        webDriver.get("http://it-ebooks.info/");  // открыть тестируемое приложение, перейдя по URL


        webDriver.findElement(By.id("q")).sendKeys("QA"); // в окно поиска побавить слово QA

        webDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/a/img")).click(); //нажать кнопку поиска

        //webDriver.findElement(By.xpath("/html/body/div[1]/form/div/div[3]/div/input")).click();


        //webDriver.quit();

    }

}
