package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/course")
	public List<Course> getAllCourse(@PathVariable String id){
		return courseService.getAllCourse(id);
				
	}
	@RequestMapping("/topics/{topicid}/course/{Id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicid}/course")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);	
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicid}/course/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id) {
		courseService.updateCourse(course);	
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicid}/course/{id}")
	public void deleteCourse(@RequestBody Course topic, @PathVariable String id) {
		courseService.deleteCourse(id);	
	}
	
}
