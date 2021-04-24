package SaturdayOctober26TestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class GoogleListener implements ITestListener {
    public void onTestStart(ITestResult result)
    {
        System.out.println("test data prepared for " + result.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("email to the supervisor");
        System.out.println("update the excel file as passed");

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("");
        System.out.println("");
        System.out.println("rerun the test with retry listener");
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        iTestContext.getCurrentXmlTest().getSuite().setDataProviderThreadCount(6);

    }

    public void onFinish(ITestContext iTestContext) {
        iTestContext.getCurrentXmlTest().getSuite().setDataProviderThreadCount(1);

    }}

