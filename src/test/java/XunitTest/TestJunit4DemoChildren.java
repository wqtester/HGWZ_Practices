package XunitTest;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJunit4DemoChildren extends TestJUnit4Demo{

    @BeforeClass
    public static void beforeAllTestCase(){
        System.out.println("TestJunit4DemoChildren beforeAllTestCase");
    }

    @AfterClass
    public static void afterAllTestCase(){
        System.out.println("TestJunit4DemoChildren afterAllTestCase");
    }

    @Before
    public void beforeTestCase(){
        System.out.println("TestJunit4DemoChildren beforeTestCase");
    }

    @After
    public void afterTestCase(){
        System.out.println("TestJunit4DemoChildren afterTestCase");
    }

    @Test
    public void testDemo1(){
        System.out.println("TestJunit4DemoChildren testDemo1");
        // assertTrue(true);
    }

    @Test
    public void testDemo3(){
        System.out.println("TestJunit4DemoChildren testDemo3");
        //assertTrue(false);
    }

    @Test
    public void testDemo2(){
        System.out.println("TestJunit4DemoChildren testDemo2");
    }

}
