package com.sc.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean{ // boot -->spring applicationContext.xml ---// @Configuration配置 ConfigBean = applicationContext.xml

	@Bean
	@LoadBalanced // Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}


//	@Bean
//	public IRule myRule() {
////		 return new RoundRobinRule();//轮询算法，按照线性轮询的方式依次选择每个服务实例
////		 return new RandomRule();//随机算法。
////		return new RetryRule();//轮询算法
//	}


}
