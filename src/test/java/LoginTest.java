import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class LoginTest extends Base {

    @BeforeTest
    public void beforeTest() throws IOException {
        driver =initializeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));


    }


}
