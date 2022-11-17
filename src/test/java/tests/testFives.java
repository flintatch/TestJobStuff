package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class testFives {

    @Test
    @DisplayName("Проверка запуска ресурса")
    void TestFirst() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("открыть боковое меню", () -> {
            $(".nav-element__burger").click();
        });
    }

    @Test
    @DisplayName("Проверка поисковика")
    void TestSecond() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("вбить любое значение", ()-> {
            $("#searchInput").setValue("носки").pressEnter();
        });
    }

    @Test
    @DisplayName("Проверка валюты")
    void TestThird() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("проверка валюты", () -> {
            $(".simple-menu__link--country").hover();
        });
    }

    @Test
    @DisplayName("Проверка корзины")
    void TestFourth() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("открыть корзину", () -> {
            $(".j-wba-header-item").click();
        });
    }

    @Test
    @DisplayName("")
    void TestFifth() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("открыть отдельную ссылку", () -> {
            $(".j-wba-footer-item").shouldHave(Condition.attribute("YouTube"));
        });
    }
}
