package org.childent01;

import org.childent01.bean.LoginUserVO;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LoginUserVO user = new LoginUserVO();
    	user.setUserName("zhangsan");
        System.out.println( "Hello World!" );
        System.out.println(user.toString());
    }
}
