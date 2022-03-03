package Positive;

import Helper.BaseTest;
import Elements.Filters;
import Pages.SearchResultPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest {


    Filters filters;
    SearchResultPage searchResultPage;

    @BeforeMethod
    public void setMet() {
        filters = new Filters(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Проверка фильтра поиска объявлений о продаже авто.")
    public void Filter() throws InterruptedException {
        filters.usedAuto()
                .enterAutoMark("Toyota") // Написать марку машины в строке поиска Марка
                .markFirstResult() // Выбрать первый результат поиска
                .enterAutoModel("Harrier") // Написать модель машины в строке поиска Модель
                .modelFirstResult() // Выбрать первый результат поиска
                .clickOnSelectorYearFrom()
                .selectYearFrom(17) // Выбрать от какого года
                .clickOnUnsoldCheckBox() // Установить поиск по непроданным
                .clickOnSelectFuel() // Нажать на список Топливо
                .selectFuel(5) // Выбрать вид топлива
                .clickOnAdvancedSearch() // Нажать на кнопку "Расширенный поиск"
                .clickOnSelectKMFrom() // Выбрать от какого пробега
                .selectKMFrom(0) // Выбрать от 1км
                .clickButton(); // Нажать кнопку "Показать"
        searchResultPage
                .getKMFromDescription() // Проверка что в результате поиска все машины с пробегом
                .findSoldOutCars() // Проверка что резульате поиска отсутствуют проданные машины
                .yearCheck() // Проверка что в результате поиска нет машин младше 2007
                .clickOnButtonNextPage() // Нажать кнопку вперёд
                .getKMFromDescription() // Проверка что в результате поиска все машины с пробегом
                .findSoldOutCars() // Проверка что резульате поиска отсутствуют проданные машины
                .yearCheck(); // Проверка что в результате поиска нет машин младше 2007
    }
}
