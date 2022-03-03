package Positive;

import Elements.Header;
import Helper.BaseTest;
import Elements.Filters;
import Pages.RegionsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListCarsTest extends BaseTest {

    Filters filters;
    Header header;
    RegionsPage regionsPage;

    @BeforeMethod
    public void setMet() {
        header = new Header(driver);
        filters = new Filters(driver);
        regionsPage = new RegionsPage(driver);
    }

    @Test
    public void getList() throws InterruptedException {
        header.clickButtonSelectRegion(); // Перейти на страницу выбора Региона
        regionsPage.choosePerm_Krai(); // Выбрать Пермский край

    }
}
