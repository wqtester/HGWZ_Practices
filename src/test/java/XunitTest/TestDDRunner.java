package XunitTest;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class TestDDRunner {

    @Test
    @Parameters({
            "1,false",
            "22,true"})

    public void testDemo(int age,boolean valid) throws Exception{
        assertThat(age>17,equalTo(valid));
    }
}
