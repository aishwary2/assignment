package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class EmployeeReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c=Class.forName("reflection.Employee");
		System.out.println(c.newInstance());
		System.out.println(c);
	System.out.println("superclass: "+c.getSuperclass());
	int mod=c.getModifiers();
	System.out.println("mod : "+mod);
	System.out.println("Access Specifier: "+Modifier.toString(mod));
	Class[]classes=c.getInterfaces();
	//System.out.println(classes[0]);
	for(Class cls:classes) {
		System.out.println(cls+" hash code : "+cls.hashCode());
	}
	Field feilds[]=c.getDeclaredFields();
	for(Field f:feilds) {
		System.out.println(f+" hash code : "+f.hashCode());
	}
	Constructor constructor[]=c.getDeclaredConstructors();
	for(Constructor fc:constructor) {
		System.out.println(fc);
	}
	
	Method[] method=c.getDeclaredMethods();
	for(Method m:method) {
		System.out.println(m);
	}
	}

}
