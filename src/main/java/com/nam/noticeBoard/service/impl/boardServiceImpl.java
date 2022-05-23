package com.nam.noticeBoard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nam.noticeBoard.mapper.boardMapper;
import com.nam.noticeBoard.service.boardService;

/***/
public class boardServiceImpl implements boardService{

	@Autowired
	private boardMapper boardMapper;
}
