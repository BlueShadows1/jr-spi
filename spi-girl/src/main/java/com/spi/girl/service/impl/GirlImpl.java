package com.spi.girl.service.impl;

import org.springframework.stereotype.Service;

import com.spi.service.People;
@Service
public class GirlImpl implements People {

	@Override
	public void people() {
		System.out.println("这是女孩!");
	}
}
