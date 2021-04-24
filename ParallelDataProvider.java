package ParallelExecutionTursday;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProvider {
    @Test(dataProvider = "DataSource")
    public void  test(int i,String y){
        long id=Thread.currentThread().getId();
        System.out.println(i+"-"+y+ "has been executed in thread number:"+id);
    }
    @DataProvider(name="DataSource",parallel = true)
    public Object[][] getData(){
        return new Object[][]{   //new object[][1]
                {1," a "},
                {2," b "},
                {3," c "},
                {4," d "},
                {5," e "},
                {6," f "},
                {7," g "},
                {8," h "},
                {9," i "},
                {10," j "},
        };
        }
}

