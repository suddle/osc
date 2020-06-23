//package com.example.demo;
//
//public class Application {
//
//}

package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
//@MapperScan(value = "com.example.mapper")
@MapperScan("com.example.demo.dao")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//部门  增删改查  模糊查询
//职位 增删改查 模糊查询
//员工 增删改查
//公告 增删改查 模糊查
//文件 上传  查询 下载 删除 模糊查询