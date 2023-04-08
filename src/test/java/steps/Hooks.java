package steps;

import com.crmpro.base.BaseCLass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseCLass {

    @Before("@Sanity")
    public void runBeforeAnyScenario(){
        System.out.println("before hook");
    }
    @After()
    public void closeBrowser(){
        driver.quit();
    }


}
