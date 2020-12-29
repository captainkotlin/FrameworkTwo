package utils;

import com.codeborne.selenide.Selenide;

import java.util.function.Function;

public abstract class AbstractTest<T extends AbstractPage<T>> {
    protected T page;

    public T open(String url, Class<T> clazz, Function<T, T> postOpenAction)
    {
        var p = Selenide.open(url, clazz);
        return postOpenAction.apply(p);
    }
}
