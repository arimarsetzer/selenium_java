<<<<<<< HEAD
#Datum Challenge with Selenium

Projeto básico de automação de testes web, com Selenium WebDriver na linguagem Java.

#Test Command:

- mvn test -Dtest=**/*RunCucumberTest cluecumber-report:reporting

#Adding dependencies on POM.XML file:

- properties
  - maven.compiler.source v1.8
  - maven.compiler.target v1.8
- dependencies
  - cucumber-junit v1.2.5
  - cucumber-java v1.2.5
  - selenium-java v3.141.59
  - cluecumber v1.2.0
  - maven-surefire-plugin v3.0.0-M5
- build
  - plugin: Maven v3.7.8, compiled with v1.8
  - cluecumber v1.2.0
  - maven-surefire-plugin v3.0.0-M5

#OOP structure

- Create Runner class: **RunCucumberTest**
  - **features**: Path where all BDD scenarios will be stored
  - **glue**: Path where the steps will be stored
- resources > features > _filename_.feature: Where we will add the BDD scenarios
- steps: Create file as javaclass that will call the functions from the Page Object
- runner: Create runner with Cucumber options, Before and After each, and test report path
- pages: Where all main functions will be stored to be reused
- support: Where specific functions will be stored to be reused
=======
# selenium_java
Challenge using Selenium Webdriver with Java language
>>>>>>> 5cd261f4cd2984cb1a828bdd5dc1fe9815df53f4
