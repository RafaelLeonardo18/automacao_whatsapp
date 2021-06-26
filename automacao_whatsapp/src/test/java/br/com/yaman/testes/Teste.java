package br.com.yaman.testes;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Teste {

    static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        try {
            openWhatsApp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openWhatsApp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy J2 Pro");
        capabilities.setCapability("uidid", "8de800bf");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.whatsapp");
        capabilities.setCapability("appActivity", "com.whatsapp.Conversation");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, capabilities);
        System.out.println("Aplicação iniciada");
    }
}