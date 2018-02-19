package com.platzi.rest;

import java.util.List;

import com.platzi.rest.dao.UserDao;
import com.platzi.rest.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //System.out.println( "Hello World!" );
       
        //User user = new User("john","123123123",false);
        
        UserDao userDao = new UserDao();
        /*
        userDao.createUser(user);
        
        List<User> lista = userDao.readAllUsers();
        for(User u : lista) {
        	System.out.println("Id: "+u.getIdUser()+" - Username: "+u.getUsername());
        }
        
        System.out.println("select by id = 3");
        User userRead = userDao.read(3);
        System.out.println(userRead.getIdUser()+" - "+userRead.getUsername());
        */
        //userDao.delete(3);
        /*
        System.out.println("lista post delete");
        lista = userDao.readAllUsers();
        for(User u : lista) {
        	System.out.println("Id: "+u.getIdUser()+" - Username: "+u.getUsername());
        }
        */
        //FALTA CERRAR LAS CONEXIONES ENTRE METODOS
        User u = new User();
        u.setIdUser(1);
        u.setUsername("john");
        u.setPassword("123123");
        u.setActive(true);
        userDao.update(u);
    }
}
