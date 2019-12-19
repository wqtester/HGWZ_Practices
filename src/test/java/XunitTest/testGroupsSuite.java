package XunitTest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SlowGroup.class) //标签分组，只跑SlowGroups的
@Categories.ExcludeCategory(FastGroup.class) //排除FastGroups的
@Suite.SuiteClasses({
        TestGroups.class
})

public class testGroupsSuite {
}
