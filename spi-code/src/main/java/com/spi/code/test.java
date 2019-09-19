package com.spi.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spi.service.People;

@RestController
public class test {
	
	@Autowired
	@Qualifier("boyImpl")
	private People people;
	
	@Autowired
	@Qualifier("boyImpl")
	private People people2;
	
	/**
	 * 一般rpc做法
	 */
	@RequestMapping("/test")
	public void test() {
		people.people();
		people2.people();
	}
	
	/**
	 * spi做法
	 * @throws Exception
	 */
	@RequestMapping("/test2")
	public void test2() throws Exception {
		PeopleFactory p = new PeopleFactory();
		p.invoker();
	}
	
	public static void main(String[] args) throws Exception {
		PeopleFactory p = new PeopleFactory();
		p.invoker();
	}
}
