package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestFives {

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
    void testSecond() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("вбить любое значение", ()-> {
            $("#searchInput").setValue("носки").pressEnter();
            sleep(5000);
            $(".searching-results__title") .shouldHave(text("носки"));
        });
    }

    @Test
    @DisplayName("Проверка валюты")
    void testThird() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("проверка валюты", () -> {
            $(".simple-menu__link--country").hover();
            $(".popup__form").shouldHave(text("Белорусский рубль"));
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
    @DisplayName("Проверка прокрутки")
    void TestFifth() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("открыть отдельную ссылку", () -> {
            $(".footer__container").scrollTo().shouldHave(text("YouTube"));
        });
    }
}
