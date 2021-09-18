package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "testSearch")
    public static Object[][] testLink5() {
        return new Object[][]{{"java"}};
    }
}
