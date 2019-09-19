package com.spi.code;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.spi.service.People;

public class PeopleFactory {

	public void invoker() throws Exception {
		ServiceLoader<People> people = ServiceLoader.load(People.class);
		Iterator<People> iter = people.iterator();
		boolean notFound = true;
		while (iter.hasNext()) {
			notFound = false;
			People p = iter.next();
			p.people();
		}
		if (notFound) {
			throw new Exception("未找到实现类");
		}			
	}
}
