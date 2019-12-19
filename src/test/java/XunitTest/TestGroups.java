package XunitTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue; //怎么才能自动导？？？

public class TestGroups {

    @Category({SlowGroup.class,FastGroup.class})
    @Test
    public void testDemo1(){
        //assertTrue(false);   //断言
        assertEquals("diff two values",100,10);

    }

    @Category(SlowGroup.class)
    @Test
    public void testDemo2(){
        //assertThat("actual value equalTo 10","10",equalTo("100")); //不加双引号时执行结果是尖括号括起来的，表明是数字（idea提供的功能）；加双引号则为字符串

/*        assertThat("actual value closeTo 10",3.14, //这里需要是double类型的小数，不然后面closeTo会报错
                closeTo(2,0.3)); //意思是范围在1.7~2.3之间，3.14不在这个范围所以执行不通过
       */
        assertTrue(false);
    }

    @Category(SlowGroup.class)
    @Test
    public void testDemo3(){
        assertTrue(false);
    }

    @Category(FastGroup.class)
    @Test
    public void testDemo4(){
        assertTrue(false);
    }
}


