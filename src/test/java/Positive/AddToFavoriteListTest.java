package Positive;

import Elements.Header;
import Helper.BaseTest;
import Pages.LoginPage;
import Pages.SelectedAutoPage;
import Pages.SellingAutoPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToFavoriteListTest extends BaseTest {

    String login = "";
    String password = "";
    int index = 1;

    Header header;
    LoginPage loginPage;
    SellingAutoPage sellingAutoPage;
    SelectedAutoPage selectedAutoPage;

    @BeforeMethod
    public void setMet() {
        header = new Header(driver);
        loginPage = new LoginPage(driver);
        sellingAutoPage = new SellingAutoPage(driver);
        selectedAutoPage = new SelectedAutoPage(driver);
    }

    @Test
    @Description(value = "Проверка функции добавления в список Избранное.")
    @Severity(SeverityLevel.CRITICAL)
    public void Favorite() {
        header.clickOnButtonLogin(); // Нажатие на кнопку Вход и Регистрация
        loginPage.enterLogin(login) // Ввод лоигна
                .enterPassword(password) // Ввод пароля
                .clickOnButtonLogin(); // Нажатие на кнопку Войти с паролем
        sellingAutoPage.selectAutoFromCarousel(index);  // Выбрать авто из премиум объявлений
        selectedAutoPage.clickOnButtonAddToFavoriteList() // Добавить в список Избранное
                .clickOnButtonDeleteFromFavoriteList(); // Удалить из списка Избранное

    }
}
