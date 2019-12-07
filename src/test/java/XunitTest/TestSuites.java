package XunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit4DemoChildren2.class,
        TestJUnit4Demo.class,
        TestJunit4DemoChildren.class
})
public class TestSuites {

}
