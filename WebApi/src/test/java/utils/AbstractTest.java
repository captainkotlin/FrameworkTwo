package utils;

import com.intuit.karate.junit5.Karate;

public abstract class AbstractTest
{
    @Karate.Test
    public abstract Karate testFullPath();
}
