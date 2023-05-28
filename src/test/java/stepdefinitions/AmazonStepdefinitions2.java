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

public class AmazonStepdefinitions2 {
    AmazonPage amazonPage= new AmazonPage();

    @Given("kullanici Amazon anasayfaya gider.")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("amazonda {string} icin arama yapar.")
    public void amazondaIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder.")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(arananKelime));
    }


}
