package cn.hpe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hpe.pojo.User;
import cn.hpe.service.UserService;

@RequestMapping("user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//模糊查询
	@RequestMapping("findName/{name}")
	public List<User> queryByName(@PathVariable("name") String name) {
		return userService.queryByName(name);
	}
	
	//查询所有
	@RequestMapping("findAll")
	public List<User> findAll(){
		return userService.findAll();
	}

}
