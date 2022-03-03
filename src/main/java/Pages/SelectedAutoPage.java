package Pages;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectedAutoPage extends BasePage {
    public SelectedAutoPage(WebDriver driver) {
        super(driver);
    }

    By buttonAddFavorite = By.className("css-qxc9at");
    By buttonDeleteFavorite = By.className("css-wul9p9");


    @Step(value = "Добавить машину в избранное.")
    public SelectedAutoPage clickOnButtonAddToFavoriteList() {
        driver.findElement(buttonAddFavorite).click();
        return this;
    }

    @Step(value = "Удалить машину из избранного.")
    public SelectedAutoPage clickOnButtonDeleteFromFavoriteList() {
        driver.findElement(buttonDeleteFavorite).click();
        return this;
    }
}
