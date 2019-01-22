package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

public class TransitToMarket {

    @FindBy(xpath = "//div[contains(@class,'home-arrow__tabs')]")
    WebElement linkMenu;

    @FindBy(xpath = "//ul[contains(@class,'topmenu__list')]")
    WebElement typeGoods;

    @FindBy(xpath = "//div[contains(@class,'catalog-menu i-bem catalog-menu_js_inited')]")
    WebElement categoryGoods;

    @FindBy(xpath = "//*[contains(text(),'Перейти ко всем фильтрам')]")
    public WebElement filter;

    public TransitToMarket (){
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    public void selectMenu(String menuItem){
        linkMenu.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();
    }

    public void selectType(String type){
        typeGoods.findElement(By.xpath(".//li[contains(@data-department,'"+type+"')]")).click();
    }

    public void selectCategory(String category){
        categoryGoods.findElement(By.xpath(".//div/div/div/div/div/a/span[1][contains(text(),'"+category+"')]")).click();
    }

}
