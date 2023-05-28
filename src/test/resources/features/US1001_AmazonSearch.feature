@regression  @pr1
Feature: US1001 Kullanici Amazon sayfasinda arama yapar

  @ilk
  Scenario: TC01 Kullanici Amazonda Nutella aratir
    Given kullanici Amazon anasayfaya gider
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    Then arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir.

  Scenario: TC02 Kullanici Amazonda Java aratir
      Given kullanici Amazon anasayfaya gider
      When arama kutusuna Java yazar ve enter tusuna
      Then arama sonuclarinin Nutella icerdigini test eder
      And sayfayi kapatir.

  Scenario: TC03 Kullanici Amazonda Java aratir
    Given kullanici Amazon anasayfaya gider
    Then amazonda "Samsung" icin arama yapar
    And sonuclarin "Samsung" icerdigini test eder
    And sayfayi kapatir.