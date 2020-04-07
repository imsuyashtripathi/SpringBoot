package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepositary topicRepositary;
	

  public List<Topic> getAllTopics()
  {
	
	  List<Topic> topics=new ArrayList<>();
	  topicRepositary.findAll().forEach(topics::add);
	  return topics;
  }
  
  public Topic getTopic(String id) {
	 return topicRepositary.findById(id);
  }
  
  public void addTopic(Topic topic) {
	  topicRepositary.save(topic);
  }

  public void updateTopic(String id, Topic topic) {
	topicRepositary.save(topic);
  }

public void deleteTopic(String id) {
	topicRepositary.deleteById(id);
	
}
}
