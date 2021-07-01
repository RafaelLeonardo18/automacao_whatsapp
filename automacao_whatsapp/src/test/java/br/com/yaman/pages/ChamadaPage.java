package br.com.yaman.pages;

import io.appium.java_client.android.AndroidDriver;

public class ChamadaPage {

    private AndroidDriver driver;

    // Construtor da classe
    public ChamadaPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Métodos de mapeamento dos testes da funcionalidade Chamada

    // CT-0001
    public void iniciarChamadaVozIndividual() throws Exception {
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView")
                .click();
        driver.findElementByAccessibilityId("Nova chamada").click();
        driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Chamada de voz\"])[6]").click();
    }

    // CT-0002
    public void iniciarChamadaVozGrupoExistente() throws Exception {
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView")
                .click();
        driver.findElementByAccessibilityId("Chamada de voz").click();
        driver.findElementByAccessibilityId("Chamar").click();
    }

    // CT-0003
    public void iniciarChamadaVozNovoGrupo() throws Exception {
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView")
                .click();
        driver.findElementByAccessibilityId("Nova chamada").click();
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
                .click();
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[6]/android.widget.LinearLayout/android.widget.TextView")
                .click();
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView")
                .click();
        driver.findElementByAccessibilityId("Chamada de voz").click();
    }

    // CT-0004
    public void iniciarChamadaVideoIndividual() throws Exception {
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView")
                .click();
        driver.findElementByAccessibilityId("Nova chamada").click();
        driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Chamada de vídeo\"])[6]").click();
    }

    // CT-0005
    public void iniciarChamadaVideoGrupoExistente() throws Exception {
        driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView")
                .click();
        driver.findElementByAccessibilityId("Chamada de vídeo").click();
    }

}
