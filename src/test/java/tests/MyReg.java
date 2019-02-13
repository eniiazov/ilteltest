package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class MyReg {

    @BeforeSuite
    public void first(){
        System.out.println("Starting the regression");
    }

    @AfterSuite
    public void end(){
        System.out.println("Closing the regression");
    }
}
