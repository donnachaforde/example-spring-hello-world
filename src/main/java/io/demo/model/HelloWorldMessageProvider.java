
package io.demo.model;


public class HelloWorldMessageProvider implements IMessageProvider
{
    @Override
    public String getMessage()
    {
        return "Hello World!";
    }
}