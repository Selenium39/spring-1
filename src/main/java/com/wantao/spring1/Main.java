package com.wantao.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {   //1.获取ApplicationContext容器
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        //2.通过容器获取Bean
    	Car car1=(Car) ac.getBean("car1");
    	System.out.println(car1);
    	Person person1=(Person) ac.getBean("person1");
        System.out.println(person1);
    }
}
