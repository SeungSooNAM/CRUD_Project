package com.nam.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nam.board.mapper.boardMapper;
import com.nam.board.service.boardService;

/***/
public class boardServiceImpl implements boardService{

	@Autowired
	private boardMapper boardMapper;
}
