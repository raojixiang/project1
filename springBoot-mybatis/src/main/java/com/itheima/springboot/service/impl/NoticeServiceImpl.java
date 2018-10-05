package com.itheima.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.springboot.domain.Notice;
import com.itheima.springboot.mapper.NoticeMapper;
import com.itheima.springboot.service.NoticeService;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	
	
	@Override
	public List<Notice> findAllNotice() {
		return noticeMapper.queryNoticeList();
		
	}


	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Map<String,Object> noticeMap = new HashMap<>();
		long total = noticeMapper.count();
		noticeMap.put("total", total);
		List<Notice> noticeList = noticeMapper.findList((page-1)*rows,rows);
		noticeMap.put("rows", noticeList);
		return noticeMap;
	}
	



}
