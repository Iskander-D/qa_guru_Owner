import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class GoogleTest extends TestBase {
    @Test
    @DisplayName("Проверка загаловка на странице")
    public void googleTitleTest() {
        assertThat(title()).contains("Google");
    }


    @Test
    @DisplayName("Проверка результата поиска") //Тест будет работать локально но не удаленно
    void googleSearchTest() {
        $("#APjFqb").setValue("Idea").pressEnter();
        ($("#rcnt")).shouldHave(text("Idea"));
    }

}

