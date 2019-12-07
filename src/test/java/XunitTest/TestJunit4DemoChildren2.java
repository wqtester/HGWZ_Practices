package XunitTest;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJunit4DemoChildren2 extends TestJunit4DemoChildren{

    @BeforeClass
    public static void beforeAllTestCaseChildren2(){
        System.out.println("Children2 beforeAllTestCase");
    }

    @AfterClass
    public static void afterAllTestCaseChildren2(){
        System.out.println("Children2 afterAllTestCase");
    }

    @Before
    public void beforeTestCaseChildren2(){
        System.out.println("Children2 beforeTestCase");
    }

    @After
    public void afterTestCaseChildren2(){
        System.out.println("Children2 afterTestCase");
    }

    @Test
    public void testDemo1Children2(){
        System.out.println("Children2 testDemo1");
        // assertTrue(true);
    }

    @Test
    public void testDemo3Children2(){
        System.out.println("Children2 testDemo3");
        //assertTrue(false);
    }

    @Test
    public void testDemo2Children2(){
        System.out.println("TestJunit4DemoChildren2 testDemo2");
    }

}
