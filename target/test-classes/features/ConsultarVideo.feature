@BuscarVideoEnYoutube
Feature: Yo como usurio quiero ingresar a la pagina de Youtube a buscar un video

  Background: ingresar a youtube
   Given El usuario ingresa a youtube 
    
    @tag1
  Scenario: Buscar su cancion favorita
  
    When El usuario busca el nombre de su cancion favorita
    Then El usurio deberia vizualizar el listado de canciones
