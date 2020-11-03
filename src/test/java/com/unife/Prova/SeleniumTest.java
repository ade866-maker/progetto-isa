/**
 * Test eseguito con Selenium WebDriver: si occupa di inserire un libro, una
 * persona, un luogo ed una libreria per poi modificare tali componenti ed
 * infine cancellarli. E' necessario settare il path contentente il 
 * WebDriver.
 */
package com.unife.Prova;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProvaApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public static void start() {
        final String webDriverPath = "C:\\Users\\andre\\Desktop\\V0.1\\Spring\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", webDriverPath);
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        /*Collegamento localhost*/
        driver.get("http://localhost:8080");
        
        
        /*Inserimento nuovo libro*/
        driver.findElement(By.linkText("Libri")).click();
        driver.findElement(By.name("id")).sendKeys("1000");
        driver.findElement(By.name("titolo")).sendKeys("Sono una prova");
        driver.findElement(By.name("autore")).sendKeys("me stesso");
        driver.findElement(By.name("genere")).sendKeys("np");
        driver.findElement(By.id("send")).click();
        
        /*Inserisci persona*/
        driver.findElement(By.partialLinkText("Perso")).click();
        driver.findElement(By.name("id")).sendKeys("1000");
        driver.findElement(By.name("Nome_Cognome")).sendKeys("Prova nome");
        Select dropdown = new Select(driver.findElement(By.id("dd1")));
        dropdown.selectByVisibleText("M");
        driver.findElement(By.name("cellulare")).sendKeys("1234567890");
        driver.findElement(By.name("email")).sendKeys("prova.prova@prova.it");
        driver.findElement(By.id("send")).click();
        
        /*Inserisci luogo*/
        driver.findElement(By.linkText("Luogo")).click();
        driver.findElement(By.name("id")).sendKeys("1000");
        driver.findElement(By.name("Citta")).sendKeys("Prova");
        driver.findElement(By.name("via")).sendKeys("Prova 123");
        driver.findElement(By.name("n_civico")).sendKeys("1234");
        driver.findElement(By.id("send")).click();
        
        
        /*Inserisci libreria*/
        driver.findElement(By.partialLinkText("Librer")).click();
        driver.findElement(By.id("id")).sendKeys("1000");
        dropdown = new Select(driver.findElement(By.id("dd1")));
        dropdown.selectByVisibleText("1000");  
        dropdown = new Select(driver.findElement(By.id("dd2")));
        dropdown.selectByVisibleText("Sono una prova");
        driver.findElement(By.id("Numero_copie")).sendKeys("0");
        driver.findElement(By.id("Costo")).sendKeys("0");
        driver.findElement(By.id("send")).click();
        
        
        /*Modifica libreria*/
        driver.navigate().to("http://localhost:8080/edit/libreria1000");
        driver.findElement(By.id("Numero_copie")).clear();
        driver.findElement(By.id("Numero_copie")).sendKeys("1");
        driver.findElement(By.id("Costo")).clear();
        driver.findElement(By.id("Costo")).sendKeys("1");
        driver.findElement(By.id("send")).click();
        
        
        /*Cancella libreria*/
        driver.navigate().to("http://localhost:8080/delete/libreria1000");
        driver.findElement(By.id("sure")).click();
         
         
         /*Modifica luogo*/
        driver.navigate().to("http://localhost:8080/edit/luogo1000");
        driver.findElement(By.id("Citta")).clear();
        driver.findElement(By.name("Citta")).sendKeys("Prova2");
        driver.findElement(By.id("via")).clear();
        driver.findElement(By.name("via")).sendKeys("Prova 321");
        driver.findElement(By.id("n_civico")).clear();
        driver.findElement(By.name("n_civico")).sendKeys("4321");
        driver.findElement(By.id("send")).click();
        /*Cancella luogo*/
        driver.navigate().to("http://localhost:8080/delete/luogo1000");
        driver.findElement(By.id("sure")).click();
         
         
         
         
         /*Modifica persona*/
        driver.navigate().to("http://localhost:8080/edit/persona1000");
        driver.findElement(By.id("Nome_Cognome")).clear();
        driver.findElement(By.name("Nome_Cognome")).sendKeys("Nome Prova");
        dropdown = new Select(driver.findElement(By.id("dd1")));
        dropdown.selectByVisibleText("F");
        driver.findElement(By.id("cellulare")).clear();
        driver.findElement(By.name("cellulare")).sendKeys("0987654321");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.name("email")).sendKeys("prova.prova@edu.prova.it");
        driver.findElement(By.id("send")).click();
        /*Cancella persona*/
        driver.navigate().to("http://localhost:8080/delete/persona1000");
        driver.findElement(By.id("sure")).click();
        
         
         
         /*Modifica libro*/
        driver.navigate().to("http://localhost:8080/edit/book1000");
        driver.findElement(By.id("titolo")).clear();
        driver.findElement(By.id("titolo")).sendKeys("Sono una prova1");
        driver.findElement(By.id("autore")).clear();
        driver.findElement(By.id("autore")).sendKeys("me stesso1");
        driver.findElement(By.id("genere")).clear();
        driver.findElement(By.id("genere")).sendKeys("np1");
        driver.findElement(By.id("send")).click();
        /*Cancella libro*/
        driver.navigate().to("http://localhost:8080/delete/book1000");
        driver.findElement(By.id("sure")).click();
        
        
         
    }
    
    @After
    public void tearDown() {
     driver.quit();
    }
}
