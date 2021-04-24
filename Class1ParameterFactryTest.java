package Factory;

import org.testng.annotations.Factory;

public class Class1ParameterFactryTest {
    @Factory
    public Object[] factory()
    {
        return new Object[]{new Class1Parameter("google","shoes"),
                new Class1Parameter("google","book"),
                new Class1Parameter("google","computer")};

    }
}
