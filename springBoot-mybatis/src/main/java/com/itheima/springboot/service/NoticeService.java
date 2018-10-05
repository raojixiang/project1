package com.itheima.springboot.service;

import java.util.List;
import java.util.Map;

import com.itheima.springboot.domain.Notice;

public interface NoticeService {

	public List<Notice> findAllNotice();

	public Map<String, Object> findByPage(Integer page, Integer rows);


}
