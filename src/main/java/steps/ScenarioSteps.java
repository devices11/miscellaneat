package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    TransitToMarketSteps transitToMarketSteps = new TransitToMarketSteps();
    FilterSteps filterSteps = new FilterSteps();
    TvFilterSteps tvFilterSteps = new TvFilterSteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMenu(String menuItem){
        transitToMarketSteps.stepSelectMenu(menuItem);
    }

    @When("^выбрана вид товара \"(.*)\"$")
    public void selectType(String type){
        transitToMarketSteps.selectType(type);
    }

    @When("^выбрана категория товаров \"(.*)\"$")
    public void selectCategory(String category){
        transitToMarketSteps.selectCategory(category);
    }

    @Then("^выполнено нажатие на Перейти ко всем фильтрам$")
    public void selectGoToFilter(){
        transitToMarketSteps.selectGoToFilter();
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> filterSteps.stepFillField(field, value));
    }

    @When("^выбран производитель \"(.*)\"$")
    public void stepSelectProducer(String producerItem){
        filterSteps.stepSelectProducer(producerItem);
    }

    @Then("^выполнено нажатие на Показать подходящие$")
    public void selectButton () {
        filterSteps.selectButton();
    }

    @When("^количество товара на странице 12$")
    public void checkCountGoods(){
        tvFilterSteps.checkCountGoods();
    }

    @When("^сохранено название первого товара в списке$")
    public void saveFirstElement(){
        tvFilterSteps.saveFirstElement();
    }

    @When("^введено значение сохраненного элемента в сторку поиска$")
    public void searchFirstElement(){
        tvFilterSteps.searchFirstElement();
    }

    @Then("^нажата кнопка Найти$")
    public void buttonSearch (){
        tvFilterSteps.buttonSearch();
    }

    @Then("^найденный элемент соответствует поиску")
    public void checkSearch(){
        tvFilterSteps.checkSearch();
    }

}
