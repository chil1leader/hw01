package web.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import web.drivers.WebDriverFactory;
import web.helpers.ActionHelper;
import web.helpers.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Класс "Гармошка"
public class Accordeon extends BaseElement {
    // Конструктор
    public Accordeon(WebElement webElement) {
        super(webElement);
    }

    // Раскрытие гармошки
    public void show() {
        WaitHelper.clickabilityOfElement(webElement);
        ActionHelper.clickElement(webElement);
    }
}