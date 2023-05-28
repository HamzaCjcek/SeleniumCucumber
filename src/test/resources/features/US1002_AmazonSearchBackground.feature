@ilk @regression @demo
Feature: US1003 Kullanici Amazonda parametre olarak yazdigi kelimeyi aratir

  Scenario: TC07 Kullanici parametre ile arama yaptirabilmeli

    Given kullanici Amazon anasayfaya gider.
    Then amazonda "Samsung" icin arama yapar.
    And sonuclarin "Samsung" icerdigini test eder.
    And sayfayi kapatir
