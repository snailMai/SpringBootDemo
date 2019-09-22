package com.example.demo.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

// 其实这个可以在resources 里边的 application.properties里边设置，但那边一个个绑定到属性字段上太累
// 其实就是省略@Value("{xxx}")这个步骤
@ConfigurationProperties(prefix = "com.mxy")
@PropertySource("application.properties")
public class ConfigBean {
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
