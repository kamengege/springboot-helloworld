package com.tedu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController等价于 requestMapping和requestBody
 * @author 南湖苏大帅
 * @version v0.1
 * @date 2017年10月31日
 */

@RestController
public class HelloController {
	
	@RequestMapping(value={"/hello","/hello2"},method=RequestMethod.POST)
	public String hello(){
		return "hello2";
	}
}
