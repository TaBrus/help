package PageObj;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {


    WebDriver WebDriver;
    public login(WebDriver WebDriver){
        this.WebDriver = WebDriver;
        PageFactory.initElements(WebDriver, this);}

    @FindBy(xpath = "//*[@id=\"login_form:in_user_name\"]") WebElement loginLocator;
    @FindBy(xpath = "//*[@id=\"login_form:password\"]") WebElement passwordLocator ;
    @FindBy(xpath = "//*[@id=\"login_form:do_login\"]") WebElement submitButton ;

    public void fillUserName(String username){
        loginLocator.sendKeys(username);}

    public void fillPassword (String password){
        passwordLocator.sendKeys(password);
    }

    public void clickSubmitButton (){
        submitButton.click();}




}
