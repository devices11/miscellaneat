package steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FilterSteps {

    @Step("Выбран производитель {0}")
    public void stepSelectProducer(String producerItem){
        new FilterPage().selectProducer(producerItem);
    }

    @Step("Поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value){
        new FilterPage().fillField(field, value);
    }

    @Step("Нажата кнопка Показать подходящие")
    public void selectButton () {
        new FilterPage().sendButton.click();
    }



}
