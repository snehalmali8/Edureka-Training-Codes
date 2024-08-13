package org.com.AOP.AOPDemo;

import org.com.aop.ActorRepository;
import org.com.aop.Config;
import org.com.aop.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
    	ActorRepository actor =  app.getBean(ActorRepository.class);
    	actor.add("Snehal");
    	actor.delete("Snehal");    }
}
