package com.ErickMejiaFull.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceScub {

	private static Map<Long, User> users = new HashMap<>();
	private static long index;
	
	static {
		User employee1 = new User(1l,"user1","2000003",20000L);
		User employee2 = new User(2l,"user2","5000008",30000L);
		users.put(1L,employee1);
		users.put(2L,employee2);
	}
	
	public static List<User> getAllUsers(){
		return new ArrayList<>(users.values());
	}
	
	public static User getUserDetails(long userId ) {
		return users.get(userId);
	}
	public static User addUser(User usuario) {
		index += 1;
		usuario.setId(index);
		users.put(index,usuario);
		return usuario;
	}
	public static User updateUser(Long userId,User usuario) {
		
		usuario.setId(userId);
		users.put(userId, usuario);
		return usuario;
	}
	
	public static User delteUser(long userId) {
		return users.remove(userId);
	}
	
	
	
}
