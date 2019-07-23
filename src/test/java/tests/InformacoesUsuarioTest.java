package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InformacoesUsuarioTest {

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Interacaoweb.createChrome(); //Abrir Google Chrome através do método createChrome da classe Interacaoweb

        navegador.findElement(By.name("email")).sendKeys("admin@phptravels.com"); //digitar no campo o email admin@phptravels.com

        navegador.findElement(By.name("password")).sendKeys("demoadmin"); //digitar no campo senha demoadmin

        //clicar no botão login
        navegador.findElement(By.xpath("/html/body/div[1]/form[1]/button")).click();
    }

    @Test
    public void testAdicionarInfoUsuario(){

        // clicar no link ACCOUNTS (id = social-sidebar-menu)
        navegador.findElement(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[5]/a")).click();

        // clicar no link Suppliers ou SUUPPLIERS
        navegador.findElement(By.xpath("//*[@id=\"ACCOUNTS\"]/li[2]/a")).click();

        //clicar no botão add
        navegador.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/button")).click();

        //preencher formulario de cadastro
        WebElement formularioCadastro = navegador.findElement(By.className("panel-body"));

        //Preenchendo o formulário
        formularioCadastro.findElement(By.name("fname")).sendKeys("Joseph");
        formularioCadastro.findElement(By.name("lname")).sendKeys("August");
        formularioCadastro.findElement(By.name("email")).sendKeys("josepha@phptravels.com");
        formularioCadastro.findElement(By.name("password")).sendKeys("12345678");
        formularioCadastro.findElement(By.name("mobile")).sendKeys("551188889999");
        WebElement campos = formularioCadastro.findElement(By.name("country"));
        new Select(campos).selectByVisibleText("Brazil");
        formularioCadastro.findElement(By.name("address1")).sendKeys("street santana\n, 25");
        WebElement campos2 = formularioCadastro.findElement(By.name("status")) ;
        new Select(campos2).selectByVisibleText("Disabled");
        WebElement campos3 = formularioCadastro.findElement(By.name("applyfor"));
        new Select(campos3).selectByVisibleText("Cars");

    }


    @After
    public void tearDown(){
        //fechar navegador
        navegador.quit();
    }

}
