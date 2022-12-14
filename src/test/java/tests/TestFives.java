package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestFives extends TestBase {

    @Test
    @DisplayName("Проверка запуска ресурса")
    void testFirst() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("открыть боковое меню", () -> {
            $(".nav-element__burger").click();
        });
        step("проверка ресурса", () -> {
            $(".menu-burger__main").shouldHave(text("Женщинам"));
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
        });
        step("проверка поисковика", () -> {
            $(".searching-results__title").shouldHave(text("носки"));
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
        });
            step("проверка валют", () -> {
            $(".popup__form").shouldHave(text("Белорусский рубль"));
        });
    }

    @Test
    @DisplayName("Проверка корзины")
    void testFourth() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("открыть корзину", () -> {
                    $(".j-item-basket").click();
        });
        step("проверка корзины", () -> {
            $(".section-header").shouldHave(text("В корзине пока пусто"));
        });
    }

    @Test
    @DisplayName("Проверка прокрутки")
    void testFifth() {
        step("Открыть ресурс Вайлдберрис", () -> {
            open("https://www.wildberries.ru");
        });
        step("открыть отдельную ссылку", () -> {
            $(".footer__container").scrollTo().shouldHave(text("YouTube"));
        });
    }
}
