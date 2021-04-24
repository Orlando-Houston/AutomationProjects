package Group;

import org.testng.annotations.Test;

public class GroupSmokeRegression {

    @Test(groups = {"smoke test"})
    void case1(){

        System.out.println("smoke case1");

    }
    @Test(groups = {"smoke test","regression test"})
    void case2(){
        System.out.println(" smoke ,regression case2");
    }
    @Test(groups = "smoke test")
    void case3(){
        System.out.println("smoke test case3");

    }
    @Test(groups = "regression test")
    void test4(){
        System.out.println(" regression case4");
}}
