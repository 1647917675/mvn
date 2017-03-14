package org.children02;

import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void say(){
		System.out.println("just for test");
	}

    public static void main( String[] args ) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
    {
        System.out.println( "Hello World!" );
        UtilInvoke.invokeMain(App.class);
    }
}
