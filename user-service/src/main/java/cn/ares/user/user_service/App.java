package cn.ares.user.user_service;

import cn.ares.user.user_core.IUserService;
import cn.ares.user.user_core.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IUserService u = new UserService();
    	u.print();
    }
}
