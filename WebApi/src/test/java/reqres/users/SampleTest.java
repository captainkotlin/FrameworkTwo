package reqres.users;

import com.intuit.karate.junit5.Karate;
import utils.AbstractTest;

public class SampleTest extends AbstractTest
{
    @Override
    @Karate.Test
    public Karate testFullPath()
    {
        return Karate.run("classpath:reqres/users/listusers.feature");
    }
}
