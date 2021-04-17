# README #

### Project - LoginTests_NtGr ###

### What is this repository for? ###

Automated selected tests cases for the recruitment task. The idea of this task was to use Page Object Pattern along with 
tests libraries - Selenium and TestNG. This test project can be extended with tests of other functionalities as well as crossbrowser tests and other features.

### Necessary tools to be installed and execution ###

- IDE (e.g Intelij, Eclipse) with configured JAVA 11, Maven, Selenium and TestNG

- those tests were designed to be tested on Chrome browser

- to execute tests please download latest version of chromedriver from
 https://sites.google.com/a/chromium.org/chromedriver/


- in TestBase class please set proper path to chromedriver in 

 System.setProperty("webdriver.chrome.driver", "here set proper path");
 
 e.g.
 
 /home/user/IdeaProjects/drivers/chromedriver
 
 - tests can be executed using test suite - loginTests.xml in testSuites package or one by one
 in LoginTest class

### Feel free to contact me ###

Szymon Rybak
