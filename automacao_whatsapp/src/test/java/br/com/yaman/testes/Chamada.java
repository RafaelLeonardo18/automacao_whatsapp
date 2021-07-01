package br.com.yaman.testes;

import java.net.URL;
import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Aplicação iniciada");
    }

    // CT-0001: Validar chamada por voz - individual
    @Test
    public void testeChamadaVozIndividual() throws Exception {
        ChamadaPage chamadaPage = new ChamadaPage(driver);
        chamadaPage.iniciarChamadaVozIndividual();
    }

    // CT-0002: Validar chamada por voz - grupo existente
    @Test
    public void testeChamadaVozGrupoExistente() throws Exception {
        ChamadaPage chamadaPage = new ChamadaPage(driver);
        chamadaPage.iniciarChamadaVozGrupoExistente();
    }

    // CT-0003 - Validar chamada por voz - novo grupo
    @Test
    public void testeChamadaVozNovoGrupo() throws Exception {
        ChamadaPage chamadaPage = new ChamadaPage(driver);
        chamadaPage.iniciarChamadaVozNovoGrupo();
    }

    // CT-0004: Validar chamada de vídeo - individual
    @Test
    public void testeChamadaVideoIndividual() throws Exception {
        ChamadaPage chamadaPage = new ChamadaPage(driver);
        chamadaPage.iniciarChamadaVideoIndividual();
    }

    // CT-0005: Validar chamada de vídeo - grupo existente
    @Test
    public void testeChamadaVideoGrupoExistente() throws Exception {
        ChamadaPage chamadaPage = new ChamadaPage(driver);
        chamadaPage.iniciarChamadaVideoGrupoExistente();
    }

    // Encerramento do driver
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}