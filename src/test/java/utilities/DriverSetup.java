package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DriverSetup {

    private static final ThreadLocal<WebDriver> LOCAL_THREAD = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        DriverSetup.LOCAL_THREAD.set(driver);
    }

    public static WebDriver getDriver() {
        return LOCAL_THREAD.get();
    }

    public WebDriver getBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("C:\\Users\\dell\\Downloads\\Compressed\\chrome-win64\\chrome.exe");
            chromeOptions.addArguments("user-data-dir=C:\\Users\\dell\\AppData\\Local\\Google\\Chrome for Testing\\User Data");
            return new ChromeDriver(chromeOptions);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        } else {
            throw new RuntimeException("For this name, there is no browser: " + browserName);
        }
    }

    @BeforeMethod
    public void openBrowser() {
        String browser = System.getProperty("browser", "chrome"); // Set default to "chrome" if no property is set
        WebDriver driver = getBrowser(browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        setDriver(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        getDriver().quit();
    }


}
