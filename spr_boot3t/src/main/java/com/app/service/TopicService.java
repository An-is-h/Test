package com.app.service;


import java.util.*;
import com.app.model.*;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic(07,"sprboot","Topic"),
			new Topic(07,"java","interaction"),
			new Topic(07,"server","apachetom")));

	
	public List<Topic> getAllTopic()
	{
		return topics;
	}
}

