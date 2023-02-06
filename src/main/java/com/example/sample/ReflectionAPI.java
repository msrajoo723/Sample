package com.example.sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectionAPI {
	 private static final String EMPLOYEE_CLASS = "com.example.sample.Employee";

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		
		Class<?> obj  = Class.forName(EMPLOYEE_CLASS);
		System.out.println(obj.getName());
		
		
		Constructor<?>[] constructors = obj.getConstructors();
		for(Constructor<?> con: constructors) {
			System.out.println("constructor's parameters count : "+con.getParameterCount());
			
			Parameter[] pars = con.getParameters();
			for(Parameter par: pars) {
				System.out.println( "Params : "+par);
			}
			//System.out.println("constructor's parameters count : "+con.getParameterCount());
		}
		
		
		Class<Employee> c1 = Employee.class;
		System.out.println(c1.isSealed());
		
		Class<Employee> c2 = Employee.class;
		
		c2.getClasses();
		c2.getResourceAsStream(EMPLOYEE_CLASS);
		c2.getInterfaces();
		c2.getSuperclass();
		c2.getPackage();
		c2.getConstructors();
		c2.getModifiers();
		c2.getAnnotations();
		c2.getMethods();
		c2.getFields();
				
		System.out.println(c1.isSealed());
		
		Class<?> c3 = Employee.class;
		Field field = c3.getField("hobbies");

		Type genericFieldType = field.getGenericType();

		if(genericFieldType instanceof ParameterizedType){
		    ParameterizedType aType = (ParameterizedType) genericFieldType;
		    Type[] fieldArgTypes = aType.getActualTypeArguments();
		    for(Type fieldArgType : fieldArgTypes){
		        Class fieldArgClass = (Class) fieldArgType;
		        System.out.println("fieldArgClass = " + fieldArgClass);
		    }
		}
		
		Field field1 = c3.getField("department");

		Type genericFieldType1 = field1.getGenericType();

		if(genericFieldType1 instanceof ParameterizedType){
		    ParameterizedType aType = (ParameterizedType) genericFieldType1;
		    Type[] fieldArgTypes = aType.getActualTypeArguments();
		    for(Type fieldArgType : fieldArgTypes){
		        Class fieldArgClass = (Class) fieldArgType;
		        System.out.println("fieldArgClass = " + fieldArgClass);
		    }
		}
		
	}
}





