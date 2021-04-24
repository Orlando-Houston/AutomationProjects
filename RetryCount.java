package October29TuesdayRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryCount  {
    public  int retryCnt=0;
    public  int maxRetryCnt=6;


    public boolean retry(){
        retryCnt++;
        return true;

    }

}
