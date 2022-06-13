package com.sbi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class FlightTest {
	public static void main(String[] args) {
	
		Flight theFlight = new Flight();
		
		Class theClass = theFlight.getClass();
		
		Constructor ctors[] = theClass.getConstructors();
		
		for (Constructor constructor : ctors) {
			System.out.println("Constructor : with "+constructor.getParameterCount()+" arguments. ");
			
			Annotation conAnno[] = constructor.getAnnotations();
			for (Annotation cons : conAnno) {
				System.out.println("Annotation for Constructor "+cons);
			}
		}
		
		System.out.println("---------------------");
		
		
		Method methods[] = theClass.getMethods();
		
		
		
		
		for (Method method : methods) {
			System.out.println("method name is : "+method.getName());
			Annotation methAnno[] = method.getAnnotations();
			for(Annotation a : methAnno) {
				System.out.println("AnnotationS :"+a);
				
				if(a instanceof DefinedBy) {
					
					DefinedBy def = (DefinedBy) a;
					String name = def.name();
					
					if(name.equalsIgnoreCase("rohit")){
						System.out.println("User available ... Access granted to "+name);
					}
					else {
						System.out.println("User not available ");
					}
							
				}
			}
			
			
		}
		System.out.println("---------------------");
		
		Field fields[] = theClass.getFields();
		for (Field field : fields) {
			System.out.println("Field is : "+field.getName());
			
			Annotation[] annField = field.getAnnotations();
			
			for (Annotation f : annField) {
				System.out.println("Annotation for "+field.getName()+" ->"+f);
			}
		}
		
		System.out.println("-----------------");
		
		Annotation anno [] = theClass.getAnnotations();
	
		for (Annotation annotation : anno) {
			System.out.println("Annotation is : "+annotation);
			if(annotation instanceof DevelopedBy) {
				DevelopedBy db = (DevelopedBy) annotation;
				String developer = db.name();
				double version=db.version();
				
				if(developer.equals("vinay") && version ==1.3) {
					System.out.println("Class Flight is valid..lets run...");
				}
				else {
					System.out.println("Class Flight is invalid...lets stop...");
				}
			}
		}
		
	}
}