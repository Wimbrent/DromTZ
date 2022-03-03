package Pages;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SellingAutoPage extends BasePage {
    public SellingAutoPage(WebDriver driver) {
        super(driver);
    }

    By carouselAuto = By.xpath("//a[@data-ftid = 'component_premium-carousel_item']");

    @Step(value = "Выбрать машину из премиум объявлений (карусель).")
    public void selectAutoFromCarousel(int index) {
        List<WebElement> select = driver.findElements(carouselAuto);
        select.get(index).click();
    }
}
