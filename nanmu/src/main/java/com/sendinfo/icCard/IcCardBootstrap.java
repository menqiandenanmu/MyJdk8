package com.sendinfo.icCard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 票务系统项目启动类
 * @className: PcAliPaySpi
 * @author: yangzy
 * @date: 2018/09/29
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.sendinfo")
@MapperScan(basePackages = "com.sendinfo.**.dao")
public class IcCardBootstrap {
	public static void main(String[] args) {
		new SpringApplication().run(IcCardBootstrap.class,args);
	}

}   
     