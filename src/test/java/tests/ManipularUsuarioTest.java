package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tests.Interacaoweb;

public class ManipularUsuarioTest {

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Interacaoweb.createChrome();
    }



    @After
    public void dearDown(){
        navegador.quit();
    }

}
