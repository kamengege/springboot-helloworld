package com.tedu.bootdemo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//通过该注解properties文件内的配置  
//通过prefix执行properties配置的前缀  
@ConfigurationProperties(prefix="user")
@Entity
public class User implements Serializable{
	//设置 自动增长主键,不可省略
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private int age;
	//记得添加 无参数构造器
	public User(){
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
