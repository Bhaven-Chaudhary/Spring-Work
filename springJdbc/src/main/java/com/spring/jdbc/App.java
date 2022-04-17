package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Running the code" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        //Student student = new Student(782,"Jhon","Cena");
        //performing insert operation
//        int result = studentDao.insert(student);
//        System.out.println("row inserted is "+ result);
              
//        Student student = new Student(456,"Kal","Drogo");
//        int result = studentDao.change(student);
//        System.out.println("updated row is "+ result);
        
        int result = studentDao.delete(222);
        System.out.println("number of rows deleted "+ result);
    }
}
