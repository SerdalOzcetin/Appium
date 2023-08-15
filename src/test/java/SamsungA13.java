import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class SamsungA13 {
    AndroidDriver driver;
    @Test
    public void deneme01() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"R68T6007ZPY");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ACER\\IdeaProjects\\Appium\\apps\\trendyol.apk");



        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



    }





}

