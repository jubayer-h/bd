package org.example;

import org.testng.annotations.DataProvider;

public class DataProviderclassleve {
    @DataProvider(name="loginDataProvider")
    public Object[][] getdata()
    {
        Object[][]data={{"ju@gmail.com","a123"},{"sam@hotmail","qwe"},{"jiha@gmail.com","dg8"}};
        return data;
    }
}
