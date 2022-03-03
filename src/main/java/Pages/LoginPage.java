package Pages;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By fieldLogin = By.id("sign");
    By fieldPassword = By.id("password");
    By buttonLogin = By.id("signbutton");

    @Step(value = "Ввод логина")
    public LoginPage enterLogin(String login) {
        driver.findElement(fieldLogin).sendKeys(login);
        return this;
    }

    @Step(value = "Ввод пароля.")
    public LoginPage enterPassword(String password) {
        driver.findElement(fieldPassword).sendKeys(password);
        return this;
    }

    @Step(value = "Нажатие на кнопку 'Войти с паролем'.")
    public void clickOnButtonLogin() {
        driver.findElement(buttonLogin).click();
    }
}
