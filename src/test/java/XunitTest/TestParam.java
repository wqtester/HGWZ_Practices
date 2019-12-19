package XunitTest;

import com.beust.jcommander.Parameter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * 改造：三个步骤
 * 1.@RunWith首先指明这个是参数化执行的类
 * 2.@Parameter 指明那两个东西（变量）可以接受外面传参  使用那两个参数 s给数据，没有s的接收数据
 * 3.@Parameters给数据,从而让上面那两个数据知道数据从哪来的（需要先构建两个参数，让用例可以引用它们）
 */

@RunWith(Parameterized.class)

public class TestParam {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0,0},{1,1},{1,2},{2,1}
        });
    }

    @Parameterized.Parameter  //(0)第0个，可以不用写，默认
    public int actual;
    @Parameterized.Parameter(1)
    public int expection;

    @Test
    public void testDemo(){
//        int actual = 10;
//        int expection =9; //实际是从外面传值，再作断言
        assertThat("demo",actual,equalTo(expection));
    }
}
