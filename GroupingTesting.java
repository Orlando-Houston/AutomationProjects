package Group;

import org.testng.annotations.Test;

public class GroupingTesting {
    @Test(groups = {"smoke test"})
    void test1(){

        System.out.println("smoke test1");

    }
    @Test
    void test2(){
        System.out.println("test2");
    }
    @Test(groups = "smoke test")
    void test3(){
        System.out.println("smoke test test3");

    }
    void test4(){
        System.out.println("test4");

        }
    }



