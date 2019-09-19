package com.spi.boy.service.impl;

import org.springframework.stereotype.Service;

import com.spi.service.People;

@Service
public class BoyImpl implements People{

	@Override
	public void people() {
		System.out.println("这是男孩！");
	}
}
