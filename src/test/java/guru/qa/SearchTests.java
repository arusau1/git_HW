package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    static Logger logger = LoggerFactory.getLogger(SearchTests.class);

    @BeforeAll
    static void config() {
        logger.info("BeforeAll Method");
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
    }

//comment1
//comment2

    @BeforeEach
    void openGooglePage() {
        logger.info("BeforeEach Method");
        open("https://www.google.com/");
    }

    @AfterEach
    void closeBrowser() {
        closeWebDriver();
    }

    @Test
    void selenideSearchTest() {
        logger.info("This is selenide test");
        $(byName("q")).setValue("selenide").pressEnter();
        $("#search").shouldHave(text("selenide.org"));
    }

    @Test
    void allureSearchTest() {
        logger.info("This is allure test");
        $(byName("q")).setValue("Allure testops").pressEnter();
        $("#search").shouldHave(text("qameta.io"));
    }
}
