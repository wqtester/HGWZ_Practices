package XunitTest;


import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*; //必须是static

@FixMethodOrder(MethodSorters.NAME_ASCENDING)  //@Test方法执行顺序
public class TestJUnit4Demo {

    @BeforeClass
    public static void beforeAllTestCase(){
        System.out.println("beforeAllTestCase");
    }

    @Test
    public void testDemo1(){
        System.out.println("testDemo1");
        assertTrue(true);
    }

    @Test
    public void testDemo3(){
        System.out.println("testDemo3");
        assertTrue(false);
    }

    @Test
    public void testDemo2(){
        System.out.println("testDemo2");
        assertTrue(false);
    }
}

