package Elements;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Header extends BasePage {
    public Header(WebDriver driver) {
        super(driver);
    }

    By region = By.xpath("//a[@data-ftid = 'component_header_region']");
    By login = By.xpath("//a[@data-ftid = 'component_header_login']");

    @Step(value = "Нажать на кнопку выбор Региона.")
    public void clickButtonSelectRegion() {
        driver.findElement(region).click();
    }

    @Step(value = "Нажать на кнопку Вход или Регистрация.")
    public void clickOnButtonLogin() {
        driver.findElement(login).click();
    }
}