package Elements;

import Helper.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

import java.util.*;

public class Filters extends BasePage {

    public Filters(WebDriver driver) {
        super(driver);
    }

    By used_auto = By.xpath("//button[@value='2']");

    By SelectorMark = By.xpath("//div[@data-ftid = 'sales__filter_fid']/div/input");
    By firstResultMark = By.xpath("//div[@class = 'css-1r0zrug ejlkvsj0'][3]/div[1]");

    By SelectorModel = By.xpath("//div[@data-ftid = 'sales__filter_mid']/div/input");
    By firstResultModel = By.xpath("//div[@data-ftid = 'sales__filter_mid']/div[2]/div/div[3]");

    By autos = By.xpath("//div[@class = 'css-pr6zei e154wmfa0']/div/div");
    By button = By.xpath("//button[@type = 'submit']");

    By SelectorFuel = By.xpath("//button[text() = 'Топливо']");
    By selectFuel = By.xpath("//div[@class = 'css-pr6zei e154wmfa0']/div");

    By SelectorYearFrom = By.xpath("//div[@data-ftid = 'sales__filter_year-from']");
    By selectYearFrom = By.xpath("//div[@data-ftid = 'sales__filter_year-from']/div/div"); //16
    By SelectorYearTo = By.xpath("//div[@data-ftid = 'sales__filter_year-to']/div/div"); //16

    By filter_advanced = By.xpath("//span[text() = 'Расширенный поиск']");

    By km_from = By.xpath("//input[@data-ftid = 'sales__filter_mileage-from']");
    By list_km_from = By.xpath("//ul[@role = 'listbox']/li");

    By km_to = By.xpath("//input[@data-ftid = 'sales__filter_mileage-to']");

    By unsold = By.xpath("//label[@for = 'sales__filter_unsold']");

    @Step(value = "В фильтре объявлений выбрать вкладку Б/У авто.")
    public Filters usedAuto() {
        driver.findElement(used_auto).click();
        return this;
    }

    @Step(value = "Нажатие на список Марка и ввод марки авто.")
    public Filters enterAutoMark(String mark) throws InterruptedException {
        driver.findElement(SelectorMark).click();
        driver.findElement(SelectorMark).sendKeys(mark);
        Thread.sleep(1000);
        return this;
    }

    @Step(value = "Нажатие на нужную марку из результата запроса.")
    public Filters markFirstResult() {
        driver.findElement(firstResultMark).click();
        return this;
    }

    @Step(value = "Нажатие на список Модель и ввод модели авто.")
    public Filters enterAutoModel(String model) throws InterruptedException {
        driver.findElement(SelectorModel).click();
        driver.findElement(SelectorModel).sendKeys(model);
        Thread.sleep(1000);
        return this;
    }

    @Step(value = "Нажатие на нужную модель из результата запроса.")
    public Filters modelFirstResult() {
        driver.findElement(firstResultModel).click();
        return this;
    }

    public Filters model(int index) {
        List<WebElement> auto = driver.findElements(autos);
        auto.get(index).click();
        return this;
    }

    @Step(value = "Нажатие на список Топливо.")
    public Filters clickOnSelectFuel() {
        driver.findElement(SelectorFuel).click();
        return this;
    }

    @Step(value = "Выбор топлива.")
    public Filters selectFuel(int index) {
        List<WebElement> fuel = driver.findElements(selectFuel);
        fuel.get(index).click();
        return this;
    }

    @Step(value = "Нажатие на список 'Год от'")
    public Filters clickOnSelectorYearFrom() {
        driver.findElement(SelectorYearFrom).click();
        return this;
    }

    @Step(value = "Выбор нужного года")
    public Filters selectYearFrom(int index) {
        List<WebElement> elements = driver.findElements(selectYearFrom);
        elements.get(index).click();
        return this;
    }

    @Step(value = "Нажатие на Расширенный поиск ")
    public Filters clickOnAdvancedSearch() {
        driver.findElement(filter_advanced).click();
        return this;
    }

    @Step(value = "Нажатие на список Пробег(от, км).")
    public Filters clickOnSelectKMFrom() {
        driver.findElement(km_from).click();
        return this;
    }

    @Step(value = "Выбор от какого пробега.")
    public Filters selectKMFrom(int index) {
        List<WebElement> elements = driver.findElements(list_km_from);
        elements.get(index).click();
        return this;
    }

    @Step(value = "Выбор вариант 'Непроданные'.")
    public Filters clickOnUnsoldCheckBox() {
        driver.findElement(unsold).click();
        return this;
    }

    @Step(value = "Нажатие на кнопку Показать.")
    public void clickButton() {
        driver.findElement(button).click();
    }


    public void carList() throws InterruptedException {

        List<String> list = new ArrayList<>();

        driver.findElement(SelectorMark).click();
    }
}