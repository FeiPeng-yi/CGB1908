package com.cy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Lazy
@Component
public class DefaultCache implements Cache{
	public void DefaultCache() {
		System.out.println("defaultCache()");
	}
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	@PreDestroy
	public void destory() {
		System.out.println("destory()");
	}
}
