@grid
Feature: Selenium Grid

  @grid_chrome  @ikisi
  Scenario: TC01 Running Chrome
    * kullanici medunna sayfasina gider
    * sayfa tittle "MEDUNNA" oldugunu test eder
    * remote driver kapatir

  @grid_firefox  @ikisi
  Scenario: TC01 Running Chrome
    * kullanici firefox ile medunna sayfasina gider
    * sayfa tittle "MEDUNNA" oldugunu test eder
    * remote driver kapatir

  @grid_edge
  Scenario: TC01 Running Chrome
    * kullanici edge ile medunna sayfasina gider
    * sayfa tittle "MEDUNNA" oldugunu test eder
    * remote driver kapatir