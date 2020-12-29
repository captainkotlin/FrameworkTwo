package gorest.users;

import com.intuit.karate.junit5.Karate;
import utils.AbstractTest;


public class SampleTest extends AbstractTest
{
    @Override
    @Karate.Test
    public Karate testFullPath() {
        return Karate.run("classpath:gorest/users");
    }
}
