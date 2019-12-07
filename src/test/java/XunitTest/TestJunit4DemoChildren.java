package XunitTest;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJunit4DemoChildren extends TestJUnit4Demo{

    @BeforeClass
    public static void beforeAllTestCaseChildren(){
        System.out.println("Children beforeAllTestCase");
    }

    @AfterClass
    public static void afterAllTestCaseChildren(){
        System.out.println("Children afterAllTestCase");
    }

    @Before
    public void beforeTestCaseChildren(){
        System.out.println("Children beforeTestCase");
    }

    @After
    public void afterTestCaseChildren(){
        System.out.println("Children afterTestCase");
    }

    @Test
    public void testDemo1Children(){
        System.out.println("Children testDemo1");
        // assertTrue(true);
    }

    @Test
    public void testDemo3Children(){
        System.out.println("Children testDemo3");
        //assertTrue(false);
    }

    @Test
    public void testDemo2Children(){
        System.out.println("TestJunit4DemoChildren testDemo2");
    }

}
