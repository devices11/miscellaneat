package steps;

import pages.TransitToMarket;
import ru.yandex.qatools.allure.annotations.Step;

public class TransitToMarketSteps {

    @Step("Выбран пункт меню {0}")
    public void stepSelectMenu(String menuItem){
        new TransitToMarket().selectMenu(menuItem);
    }

    @Step("Выбрана категория товаров {0}")
    public void selectType(String type){
        new TransitToMarket().selectType(type);
    }

    @Step("Выбрана категория товаров {0}")
    public void selectCategory(String category){
        new TransitToMarket().selectCategory(category);
    }

    @Step("Выбран Перейти ко всем фильтрам")
    public void selectGoToFilter(){
        new TransitToMarket().filter.click();
    }



}
