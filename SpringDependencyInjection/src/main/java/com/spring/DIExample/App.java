package com.spring.DIExample;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Employee employeeSetter = (Employee) context.getBean("employeeSetter");
    	Employee employeeConstructor = (Employee) context.getBean("employeeConstructor");
    	System.out.println(employeeSetter);
        System.out.println(employeeConstructor);
        
    	Employee employeeNumSetter = (Employee) context.getBean("employeeNumSetter");
    	Employee employeeNumConstruct = (Employee) context.getBean("employeeNumConstruct");
        System.out.println(employeeNumSetter);
        System.out.println(employeeNumConstruct);
        
        Employee employeeTelephone1 = (Employee) context.getBean("employeeTelephone1");
        System.out.println(employeeTelephone1);
        
        Employee employeeTelephone2 = (Employee) context.getBean("employeeTelephone2");
        System.out.println(employeeTelephone2);
        
        String upperCase = employeeSetter.getName().toUpperCase() + " " + employeeConstructor.getName().toUpperCase();
        System.out.println(upperCase);
        
        List<String> lines = new ArrayList<String>();
        lines.add(employeeSetter.getName());
        lines.add(employeeConstructor.getName());
        lines.add(employeeNumConstruct.getName());
        writeFile(lines);
    }
    
    private static void writeFile(List<String> lines) throws IOException {
    	Path file = Paths.get("C:/testFunction.txt");
        Files.write(file, lines, Charset.forName("UTF-8"));
        System.out.println("write file success.");
    }
}
