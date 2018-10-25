
package io.demo;

import io.demo.model.IMessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import java.io.FileInputStream;
import java.util.Properties;

/*
 * Note: The program is dependent on two external libraries:
 *     - spring-core-1.0.2
 *     - commons-logging-1.2
 *
 * Technically, we only invoke Spring APIs but Sprint itself is dependent on Apache commons-logging.
 * 
 */    

public class HelloWorldSpring
{
    public static void main(String[] args) throws Exception
    {
        // get the bean factory & use it to create an instance of the MessageRender by 'name'
        BeanFactory beanFactory = getBeanFactory();
        IMessageRenderer messageRenderer = (IMessageRenderer)beanFactory.getBean("renderer");
        messageRenderer.render();

        // pause the program for a few seconds to ensure we don't miss the message
        Thread.sleep(5 * 1000);
    }


    private static BeanFactory getBeanFactory() throws Exception
    {
        // get the bean factory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // create a definition reader
        PropertiesBeanDefinitionReader beanDefinitionReader = new PropertiesBeanDefinitionReader(beanFactory);

        // load the configuration options from the external meta definition (file)
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/main/resources/beans.properties"));

        // use the bean definition reader to register beans with Spring
        beanDefinitionReader.registerBeanDefinitions(properties);

        return beanFactory;
    }
}