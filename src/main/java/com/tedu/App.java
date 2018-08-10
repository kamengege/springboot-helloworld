package com.tedu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.bootdemo.User;
import com.tedu.respository.UserRepository;

/**
 * SpringBootApplication指定这是一个spring的应用程序
 * @author 南湖苏大帅
 * @version v0.1
 * @date 2017年10月31日
 */
@SpringBootApplication
@RestController
public class App 
{	
	@Value("${user.name}")
	private String name;
	
	@Value("${user.age}")
	private String age;
	
	@Autowired
	private User user;
	
	
	
	@Autowired
	private UserRepository userRepository;
	/**
	 * 查询数据
	 * @return
	 */
	@GetMapping("/users")
	public List<User> findAll(){
		return userRepository.findAll();
	}
	@PostMapping("/users")
	public User addUser(){
		User u=new User();
		u.setName("王麻子22");
		u.setAge(23);
		return userRepository.save(u);
	}
	
	
	
	
    public static void main( String[] args )
    {
       /*
        * main方法中启动应用
        */
    	SpringApplication.run(App.class, args);
    }
}
