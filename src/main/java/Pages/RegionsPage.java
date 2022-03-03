package Pages;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegionsPage extends BasePage {
    public RegionsPage(WebDriver driver) {
        super(driver);
    }

    By Perm_krai = By.linkText("Пермский край");

    @Step(value = "Выбрать Пермский Край.")
    public void choosePerm_Krai() {
        driver.findElement(Perm_krai).click();
    }
}
