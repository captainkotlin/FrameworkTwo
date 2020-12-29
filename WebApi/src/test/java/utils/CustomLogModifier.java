package utils;

import com.intuit.karate.http.HttpLogModifier;

public class CustomLogModifier implements HttpLogModifier
{
    @Override
    public boolean enableForUri(String uri)
    {
        return false;
    }

    @Override
    public String uri(String uri)
    {
        return null;
    }

    @Override
    public String header(String header, String value)
    {
        return null;
    }

    @Override
    public String request(String uri, String request)
    {
        return null;
    }

    @Override
    public String response(String uri, String response)
    {
        return null;
    }
}
