package com.org.MavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.bean.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "First Maven project!" );
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Manager m = (Manager) app.getBean("manager");
        m.doWork();
        m.callMeeting();
    }
}
