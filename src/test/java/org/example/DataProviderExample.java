package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    //@Test(dataProvider = "loginDataProvider")
    @Test(dataProvider = "loginDataProvider" ,dataProviderClass = DataProviderclassleve.class)
    public void logintest(String email, String pwd){
        System.out.println(email+"   "+pwd);

    }

/*
    @DataProvider(name="loginDataProvider")
    public Object[][] getdata()
    {
        Object[][]data={{"ju@gmail.com","a123"},{"sam@hotmail","qwe"},{"jiha@gmail.com","dg8"}};
    return data;
}

 */
}
