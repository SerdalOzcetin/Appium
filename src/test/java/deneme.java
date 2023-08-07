
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class deneme {


    AndroidDriver driver;

    @Test
    public void deneme01() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\asus\\IdeaProjects\\Appium\\apps\\Calculator_8.4.1 (520193683)_Apkpure.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
}
