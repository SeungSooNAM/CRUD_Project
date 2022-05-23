package com.nam.noticeBoard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nam.noticeBoard.mapper.noticeBoardMapper;
import com.nam.noticeBoard.service.noticeBoardService;

/***/
public class noticeBoardServiceImpl implements noticeBoardService{

	@Autowired
	private noticeBoardMapper noticeBoardMapper;
}
