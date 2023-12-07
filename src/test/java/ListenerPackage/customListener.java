package ListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListener implements ITestListener {

    //this belongs to ItestListener and will execute before starting of test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Starts test execution ....."+arg.getName());
    }
    //this belongs to ITestListener and will execute after starting of test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("Finish test execution ......"+arg.getName());
    }
    //This belongs to ITestListener and will execute before the main test start i.e @Test
    public void onTestStart(ITestResult arg){
        System.out.println("Starts test ....."+arg.getName());
    }
    //for test case fail
    public void onTestFailure(ITestResult arg){
        System.out.println("Fail the test ....."+arg.getName());
    }
    //this belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg){
        System.out.println(" Skipped test ...."+arg.getName());
    }
}
