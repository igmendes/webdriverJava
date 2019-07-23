package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Interacaoweb {

    public static WebDriver createChrome(){
        //abir navegador chrome
        System.setProperty("webdriver.chrome.driver","/home/igor/Downloads/chromedriver_linux64/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //abrir endereço phptravels
        navegador.get("https://www.phptravels.net/admin");

        return navegador;
    }
}
