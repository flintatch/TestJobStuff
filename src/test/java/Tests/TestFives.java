package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestFives extends TestBase {

    @Test
    @DisplayName("Проверка запуска ресурса")
    void TestFirst() {
        step("открыть ресурс", () -> {
            open("https://russian.rt.com");
        });
    }
}
