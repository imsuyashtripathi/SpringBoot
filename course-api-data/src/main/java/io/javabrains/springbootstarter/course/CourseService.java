package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepositary courseRepositary;
	

  public List<Course> getAllCourse(String TopicId)
  {
	
	  List<Course> course=new ArrayList<>();
	  courseRepositary.findByTopicId(TopicId).forEach(course::add);
	  return course;
  }
  
  public Course getCourse(String id) {
	 return courseRepositary.findById(id);
	 }
  
  public void addCourse(Course course) {
	  courseRepositary.save(course);
  }

  public void updateCourse(Course course) {
	  courseRepositary.save(course);
  }

public void deleteCourse(String id) {
	courseRepositary.deleteById(id);
	
}
}
