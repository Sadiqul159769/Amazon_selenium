package main.java.pageEvents;

import dev.failsafe.internal.util.Assert;
import main.java.pageObjects.LoginPageElements;
import main.java.utils.ElementFetch;

public class LoginPageEvents {
    public void verifyLoginPageOpenOrNot(){
        ElementFetch elementFetch= new ElementFetch();
        Assert.isTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginTest).size()>0,"Login Page did not open");
    }
    public void enterTheEMailID(){
        ElementFetch elementFetch= new ElementFetch();
        elementFetch.getWebElement("ID",LoginPageElements.emailAddress).sendKeys("Sadiqul159769@gmail.com");
    }
}
