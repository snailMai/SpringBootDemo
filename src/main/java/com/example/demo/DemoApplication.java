package com.example.demo;

import com.example.demo.setting.ConfigBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    // test application.properties
//    @Value("${com.demo.id}")
//    private String id;
//    @Value("${com.demo.name}")
//    private String name;
//    @Value("${com.demo.want}")
//    private String want;
//
//    @RequestMapping("/user")
//    public String hexo(){
//        return "id是" + id + "\n" + name + "," + want;
//    }

    // @RestController注解等价于@Controller+@ResponseBody的结合，使用这个注解的类里面的方法都以json格式输出。
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }

}

// 原配置backup
//@SpringBootApplication   // 主要目的是开启自动配置
//public class DemoApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//    }
//
//}
