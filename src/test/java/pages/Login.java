package pages;

import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver navegador;

    public Login(WebDriver navegador){
        this.navegador = navegador;
    }

    public FormLogin clicklogin(){
        return new FormLogin(navegador);
    }
}
