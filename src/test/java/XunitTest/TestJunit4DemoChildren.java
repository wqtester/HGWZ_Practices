package XunitTest;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJunit4DemoChildren extends TestJUnit4Demo{

    @BeforeClass
    public static void beforeAllTestCaseChildren(){
        System.out.println("TestJunit4DemoChildren beforeAllTestCase");
    }

    @AfterClass
    public static void afterAllTestCaseChildren(){
        System.out.println("TestJunit4DemoChildren afterAllTestCase");
    }

    @Before
    public void beforeTestCaseChildren(){
        System.out.println("TestJunit4DemoChildren beforeTestCase");
    }

    @After
    public void afterTestCaseChildren(){
        System.out.println("TestJunit4DemoChildren afterTestCase");
    }

    @Test
    public void testDemo1Children(){
        System.out.println("TestJunit4DemoChildren testDemo1");
        // assertTrue(true);
    }

    @Test
    public void testDemo3Children(){
        System.out.println("TestJunit4DemoChildren testDemo3");
        //assertTrue(false);
    }

    @Test
    public void testDemo2Children(){
        System.out.println("TestJunit4DemoChildren testDemo2");
    }

}
