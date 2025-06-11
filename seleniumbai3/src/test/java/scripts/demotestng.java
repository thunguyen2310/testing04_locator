package scripts;

import org.testng.annotations.*;

public class demotestng {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("test case verify beforeSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("test case verify BeforeTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("test case verify BeforeClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("test case verify BeforeMethod");
    }
    @Test
    public void verifybooking(){
        System.out.println("test case verify booking");
    }
    @Test
    public void verifylogin(){
        System.out.println("test case verify login");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("test case verify AfterSuite");
    }
}
