package org.children02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UtilInvoke {

	public static void invokeMain(Class classe) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		  Method method = classe.getMethod("say");
		  method.invoke(classe.newInstance() );
	}
}
