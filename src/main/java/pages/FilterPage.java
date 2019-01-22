package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

public class FilterPage {

    @FindBy(name = "glf-pricefrom-var")
    WebElement glf_pricefrom_var;

    @FindBy(name = "glf-priceto-var")
    WebElement glf_priceto_var;

    @FindBy(xpath = "//div[contains(@data-filter-id,'7893318')]//div[contains(@class,'n-filter-block__list-items')]")
    WebElement producer;

    @FindBy(xpath = "//a[contains(@class,'button_action_show-filtered')]")
    public WebElement sendButton;

    public FilterPage(){
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.click();
        element.sendKeys(value);
    }

    public void fillField(String fieldName, String value){
        switch (fieldName) {
            case "Цена от":
                fillField(glf_pricefrom_var, value);
                break;
            case "Цена до":
                fillField(glf_priceto_var, value);
                break;
        }
    }

    public void selectProducer(String producerItem){
        producer.findElement(By.xpath(".//*[contains(text(),'"+producerItem+"')]")).click();
    }

}
