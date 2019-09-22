package com.example.demo.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// 该类为使用自定义配置文件
// 三个都不能缺（只是自己的测试）
@Configuration
@ConfigurationProperties(prefix = "com.mxy")
@PropertySource("classpath:test.properties")
// 可以简写为@PropertySource("test.properties")         // 只能是再resources文件下
// 如果是resources的子文件下，如：templates中创建.properties文件，则为@PropertySource("classpath:template/test.properties")
public class ConfigAddrBean {
    private String name;
    private String age;
    private String nation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
