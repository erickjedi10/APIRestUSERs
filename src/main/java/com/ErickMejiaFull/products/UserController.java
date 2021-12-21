package com.ErickMejiaFull.products;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return UserServiceScub.getAllUsers();
	}
	@GetMapping("/user/{userId}")
	public User getUserDetails(@PathVariable Long employeeId){
		return UserServiceScub.getUserDetails(employeeId);
	} 
	@PostMapping("/addUser")
	public User addUser(@RequestBody User usuario) {
		return UserServiceScub.addUser(usuario);
	}
	@PutMapping("/updateUser/{userId}")
	public User updateUser(@PathVariable Long userId, @RequestBody User usuario) {
		return UserServiceScub.updateUser(userId, usuario);
	}
	@DeleteMapping("deleteUser/{userId}")
	public User deleteUser(@PathVariable Long userId) {
	
		return UserServiceScub.delteUser(userId);
	}
	
}

