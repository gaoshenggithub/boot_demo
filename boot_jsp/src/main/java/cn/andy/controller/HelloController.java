package cn.andy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andy
 * @email andy.@163.com
 */
@org.springframework.stereotype.Controller
public class HelloController {

	@GetMapping("/hello")
	public String index(Model model){
		System.out.println("-----------");
		model.addAttribute("name","String");
		return "index";
	}
}
