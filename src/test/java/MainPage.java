import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public MainPage openPage() {
        open(baseUrl);
        return this;
    }
}
