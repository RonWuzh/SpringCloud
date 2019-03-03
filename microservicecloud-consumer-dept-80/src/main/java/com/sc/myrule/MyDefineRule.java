package com.sc.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MyDefineRule {
	@Bean
	public IRule myRule() {
//		return new RandomRule();// Ribbon默认是轮询，我自定义为随机
		// return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机

		 return new RebuildRandomRule();// 我自定义为每台机器3次
	}
}
