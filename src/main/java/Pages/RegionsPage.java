package Pages;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegionsPage extends BasePage {
    public RegionsPage(WebDriver driver) {
        super(driver);
    }

    By Permsky_krai = By.linkText("Пермский край");

    @Step(value = "Выбрать Пермский Край.")
    public void selectPermsky_Krai() {
        driver.findElement(Permsky_krai).click();
    }
}
