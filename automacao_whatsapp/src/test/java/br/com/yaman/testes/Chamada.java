package br.com.yaman.testes;

import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.yaman.pages.ChamadaPage;
import io.appium.java_client.android.AndroidDriver;

public class Chamada {

    private static AndroidDriver driver;

    @BeforeClass
    public static void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy J2 Pro");
        capabilities.setCapability("uidid", "8de800bf");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        System.out.println("Aplicação iniciada");
    }

    // CT-0001: Validar iniciar chamada por voz - individual
    @Test
    public void testeChamadaVozIndividual() throws Exception {
        ChamadaPage chamadaPage = new ChamadaPage(driver);
        chamadaPage.iniciarChamadaVozIndividual();
    }

    // CT-0004: Validar iniciar chamada de vídeo
    @Test
    public void testeChamadaVideoIndividual() throws Exception {
        ChamadaPage chamadaPage = new ChamadaPage(driver);
        chamadaPage.iniciarChamadaVideoIndividual();
    }

    // Encerramento do driver
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}