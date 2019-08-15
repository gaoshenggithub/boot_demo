package cn.andy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Andy
 * @email andy.@163.com
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello(){
		return "Hello,树哥";
	}

	@GetMapping("/getMap")
	public Map<String,Object> getMap(){
		return new HashMap<String,Object>(){{
			put("name","andy");
			put("gender","男");
			put("age","15");
		}};
	}
}
