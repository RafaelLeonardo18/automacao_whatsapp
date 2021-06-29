package br.com.yaman.pages;

import io.appium.java_client.android.AndroidDriver;

public class ChamadaPage {

    private AndroidDriver driver;

    // Construtor da classe
    public ChamadaPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Métodos que representam os casos de teste da funcionalidade Chamada

    public void iniciarChamadaVozIndividual() throws Exception {
        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"WhatsApp\"]/android.widget.ImageView")
                .click();
        Thread.sleep(5000);
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView")
                .click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Nova chamada").click();
        Thread.sleep(5000);
        driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Chamada de voz\"])[6]").click();
    }

    public void iniciarChamadaVozGrupoExistente() throws Exception {
        driver.findElementByXPath(
                "//android.widget.FrameLayout[@content-desc=\"WhatsApp, 1 novo item\"]/android.widget.ImageView")
                .click();
        Thread.sleep(5000);
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView")
                .click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Chamada de voz").click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Chamar").click();
    }

    public void iniciarChamadaVideoIndividual() throws Exception {
        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"WhatsApp\"]/android.widget.ImageView")
                .click();
        Thread.sleep(5000);
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView")
                .click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Nova chamada").click();
        Thread.sleep(5000);
        driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Chamada de vídeo\"])[6]").click();
    }

}
