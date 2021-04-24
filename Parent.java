package Homework.AfterBeforeSiut;

import org.junit.runners.Suite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Parent {

    @BeforeSuite
    public void bs(){
        System.out.println("Before suit");
    }
    @AfterTest
    public void as(){
        System.out.println("After suit");
    }
}
