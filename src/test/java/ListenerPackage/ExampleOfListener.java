package ListenerPackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//when you will use xml file to run that time can not use @listeners or below line, only use xml file
//@Listeners(ListenerPackage.customListener.class)
public class ExampleOfListener {
    @Test
    void test1(){
        System.out.println("This is test-1");
        Assert.assertEquals("A","A");
    }
    @Test
    void test2(){
        System.out.println("This is test-2");
        Assert.assertEquals("a","1");
    }
    @Test
    void test3(){
        System.out.println("This is test -3");
        throw  new SkipException("This is skip exception ----");
    }
}
