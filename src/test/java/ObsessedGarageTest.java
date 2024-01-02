import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObsessedGarageTest extends TestBase {


    @Test
    @DisplayName("Проверка загаловка на странице")
    public void googleTitleTest() {
        assertThat(title()).contains( "Obsessed Garage | Home Of The Obsessed");

    }


    @Test

    @DisplayName("Проверка результата поиска") //Тест будет работать локально но не удаленно
    void googleSearchTest() {
        step("Открываем ссылку Open Box/Discount", () -> {
            $$(".site-nav__item").find(text("Open Box/Discount")).click();
        });
        step("Проверяем наличие заголовка открывшейся страницы Matty's Trinkets & Treasures ", () -> {
            $("h1.section-header__title").shouldHave(text("Matty's Trinkets & Treasures"));
        });
    }

}

