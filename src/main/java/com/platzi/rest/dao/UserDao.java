package com.platzi.rest.dao;

import java.util.List;

import com.platzi.rest.model.User;

public class UserDao extends PlatziSession implements IUserDao {

	PlatziSession platziSession;
	
	public UserDao() {
		platziSession = new PlatziSession();
	}

	public void createUser(User user) {
		platziSession.getSession().persist(user);//se recomienda usar persist en vez de save en la documentacion actualizada de hibernate
		platziSession.getSession().getTransaction().commit();
	}

	public List<User> readAllUsers() {
		return platziSession.getSession().createQuery("from User").list(); //User se refiere a la clase User
	}

	public User read(long id) {
		return (User)platziSession.getSession().createQuery("from User where id = :id").setParameter("id", id).getSingleResult();
	}

	public void delete(long id) {
		//este caso sirve tanto para update como delete
		//sirve de esta forma:
		//User obj=(User)platziSession.getSession().get(User.class,id);
		//o sirve de esta forma
		platziSession.getSession().createQuery("delete from User where id = :id").setParameter("id", id).executeUpdate();
		//y al final hay que comitear
		platziSession.getSession().getTransaction().commit();
	}

	public void update(User user) {
		platziSession.getSession().createQuery("update User set username = :username, password = :password, active = :active where id = :id")
			.setParameter("username", user.getUsername())
			.setParameter("password", user.getPassword())
			.setParameter("active", user.isActive())
			.setParameter("id", user.getIdUser())
			.executeUpdate();
		platziSession.getSession().getTransaction().commit();
		
	}

}
