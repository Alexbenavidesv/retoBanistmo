#Autor: abenavidesv

  Feature: search and download the economic news report
    As a user, I want to access the Bancolombia page and download the report called OPEP+ aumentara la oferta de petroleo en julio de 2021
    Scenario:  Find the requested report
    Given that Alex download the report called "OPEP+ aumentara la oferta de petroleo en julio de 2021"
    When he looks for the report on the page
    Then he finds and downloads the PDF report called informe-sectorial-petroleo-junio-2021.pdf
