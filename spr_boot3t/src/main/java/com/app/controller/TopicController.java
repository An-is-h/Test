package com.app.controller;

import org.springframework.web.bind.annotation.*;
import com.app.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.app.model.*;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService ts;
	@GetMapping("/topic")
	public List<Topic> tp()
	{
		return ts.getAllTopic();
	}

}
