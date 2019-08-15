package cn.andy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Andy
 * @email andy.@163.com
 */
@SpringBootApplication(scanBasePackages = "cn.andy")
@ComponentScan({"cn.andy"})
public class BootJspApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootJspApplication.class);
	}
}
