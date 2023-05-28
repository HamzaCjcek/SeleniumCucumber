package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepdefinitions {
    AmazonPage amazonPage= new AmazonPage();

    @Given("kullanici Amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("arama kutusuna Nutella yazar ve enter tusuna basar")
    public void arama_kutusuna_nutella_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expectedIcerik="Nutella";

    }
    @Then("sayfayi kapatir.")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusuna Java yazar ve enter tusuna")
    public void aramaKutusunaJavaYazarVeEnterTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedIcerik="Java";
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }

    @Then("amazonda {string} icin arama yapar")
    public void amazondaIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(arananKelime));
    }


}
