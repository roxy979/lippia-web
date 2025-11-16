@BusquedaGoogle
Feature: As a potential client i need to search in google to find a web site

  Background:
    Given The client is on google page

 Scenario Outline:The client search by <expression>

    When The client search for word <expression>
    Then The client verify that results are shown properly

   @SearchCrowdarAcademy
   Examples:
     |expression     |
     |Crowdar Academy|

   @SearchCalidad
   Examples:
     |expression     |
     |Calidad        |

   @SearchSoftware
   Examples:
     |expression     |
     |Software       |

   @SearchTesting
   Examples:
     |expression     |
     |Testing        |













 