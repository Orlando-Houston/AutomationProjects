package Factory;

import org.testng.annotations.Factory;

public class ClassTestFactry {
    @Factory
    public Object[] factory()
    {
        return new Object[]{new ClassTest(),new ClassTest(),new ClassTest()};

    }
}

