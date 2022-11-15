package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
