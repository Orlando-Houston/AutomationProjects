package October20SondayAfterBefore;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loan {
    @BeforeTest
    public void loanList(){
        System.out.println("Loans listed");
    }
    @Test
    public void loanAmount (){
        System.out.println("Loan Calculated");

    }
}
