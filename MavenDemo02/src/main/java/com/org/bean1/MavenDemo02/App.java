package com.org.bean1.MavenDemo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.bean2.Config;
import com.org.bean2.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
    	Manager m = (Manager) app.getBean("manager");
    	m.doWork();
    	
    }
}
