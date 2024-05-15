import config.WebDriverProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Sleeper;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class ObsessedGarageTest extends TestBase {


//    @Test
//    @DisplayName("Проверка загаловка на странице")
//    public void googleTitleTest() {
//        mainPage.openPage();
//        assertThat(title()).contains("Obsessed Garage | Home Of The Obsessed");
//
//    }


    @Test
    @DisplayName("Проверка результата поиска")
    void googleSearchTest() {
        mainPage.openPage();
//        sleep(5000);
        $(".template-index").doubleClick();

//        $("# title-Close dialog 6").click();
        step("Проверить заголовок BILT-HAMBER", () -> {
            $(".hero__animation-contents").shouldHave(text("BILT-HAMBER"));
        });

    }

}

