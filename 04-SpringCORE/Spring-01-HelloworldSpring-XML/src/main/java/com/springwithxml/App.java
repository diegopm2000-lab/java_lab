package com.springwithxml;

import com.springwithxml.beans.World;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("com/springwithxml/xml/beans.xml");
        
        // Alternative using the Class
        World myWorld = (World) appContext.getBean(World.class);
        System.out.println(myWorld.getGreetings());

        // Alternative using the xml configuration id of the bean
        World mySecondWorld = (World) appContext.getBean("world");
        System.out.println(mySecondWorld.getGreetings());

        ((ConfigurableApplicationContext) appContext).close();
    }
}
