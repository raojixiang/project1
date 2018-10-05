package com.itheima.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.springboot.domain.Notice;
import com.itheima.springboot.service.NoticeService;


@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAllNotice")
	public List<Notice> queryNoticeList(){
		return  noticeService.findAllNotice();
	}

	@PostMapping("/findByPage")
	public Map<String, Object> findByPage(Integer page,Integer rows){
		
		return noticeService.findByPage(page,rows);
		
	}
	
	
	
}




