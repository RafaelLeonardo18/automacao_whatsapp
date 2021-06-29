package br.com.yaman.pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

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
