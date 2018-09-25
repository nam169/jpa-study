/*package com.namnh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.namnh.common.Constant;
import com.namnh.service.kafka.ProducerService;

@RestController
public class TestController {
	
	@Autowired
	private ProducerService producerService;
	
	@GetMapping("/")
	public @ResponseBody String test()
	{
		producerService.send(Constant.UPDATE_ACCOUT_TOPIC, "Test topic");
		return "Htell";
	}
}
*/