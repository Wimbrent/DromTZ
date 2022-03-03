package Pages;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    By Description_KM = By.xpath("//div[@data-ftid = 'component_inline-bull-description']/span[5]");
    By sold_out = By.xpath("//span[@data-crossed-bull = 'true']");
    By year = By.xpath("//span[@data-ftid = 'bull_title']");
    By buttonNext = By.xpath("//a[@data-ftid = 'component_pagination-item-next']");


    @Step(value = "Проверить что в результате поиска нет машины без пробега.")
    public SearchResultPage getKMFromDescription() {

        List<Integer> getKMS = new ArrayList<>();
        List<WebElement> elements = driver.findElements(Description_KM);
        for (WebElement e : elements) {
            Scanner scanner = new Scanner(e.getText());
            while (scanner.hasNextInt())
                getKMS.add(scanner.nextInt());
        }

        int total = 0;

        for (Integer getKM : getKMS) {
            if (getKM > 0) {
                total += 1;
            }
        }

        if (total == getKMS.size()) {
            System.out.println("Все машины с пробегом!");
        } else System.out.println("Есть машины без пробега!");
        return this;
    }

    @Step(value = "Проверить что в результате поиска нет проданных машин.")
    public SearchResultPage findSoldCars() {

        List<String> getSoldOutCars = new ArrayList<>();
        List<WebElement> elements = driver.findElements(sold_out);

        for (WebElement e : elements) {
            getSoldOutCars.add(e.getText());
        }

        if (getSoldOutCars.size() == 0) {
            System.out.println("В результате поиска отсутствуют проданные машины.");
        } else
            System.out.println("В результате поиска есть проданные машины.");

        return this;
    }

    @Step(value = "Проверить что в результате поиска нет машин младше 2007 года.")
    public SearchResultPage checkingTheYear() {

        List<Integer> getYears = new ArrayList<>();
        List<WebElement> elements = driver.findElements(year);

        for (WebElement e : elements) {
            Scanner scanner = new Scanner(e.getText());
            while (scanner.hasNextInt())
                getYears.add(scanner.nextInt());
        }

        int total = 0;

        for (Integer getYear : getYears) {
            if (getYear < 2007) {
                total += 1;
            }
        }

        if (total == 0) {
            System.out.println("Все машины от 2007 года!");
        } else System.out.println("Есть машины раньше 2007 года!");
        return this;
    }

    public SearchResultPage clickOnButtonNextPage() {
        driver.findElement(buttonNext).click();
        System.out.println("________________");
        return this;
    }
}
