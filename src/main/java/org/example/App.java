package org.example;

/**
 * Hello world!
 *
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.example.springDI.config.ComponentScanConfig;
import org.example.springDI.data.StudentDao;
import org.example.springDI.service.StudentManagement;
import org.example.springDI.util.UserInputService;

public class App
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        //StudentDao studentDao = context.getBean(StudentDao.class);

//    	UserInputService userInputService = context.getBean(UserInputService.class);
//
//    	System.out.println(userInputService.getInt());

        StudentManagement studentManagement = context.getBean(StudentManagement.class);

        System.out.println(studentManagement.create());

        context.close();
    }
}