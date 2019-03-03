package com.sc.springcloud.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.sc.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public Dept get(long id) {
				return new Dept().setDeptno(id).setDname("此ID：" + id + "没有查到相关信息--DeptClientServiceFallbackFactory")
						.setDb_source("没有数据库信息");
			}

			@Override
			public List<Dept> list() {
				return null;
			}

			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};
	}
}
