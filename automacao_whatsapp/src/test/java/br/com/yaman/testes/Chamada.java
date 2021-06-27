package br.com.yaman.testes;

import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Chamada {

    private static AppiumDriver<MobileElement> driver;

    /*
     * Configurações do driver do Appium
     */
    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel4");
        capabilities.setCapability("uidid", "30.7.4-7453540");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("emulatorVersion", "30.7.4-7453540");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capabilities);
        System.out.println("Aplicação iniciada");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
