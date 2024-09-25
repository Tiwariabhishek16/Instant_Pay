package com.third_party_api.demo.Api.Services;

import java.util.List;

import com.third_party_api.demo.Api.Entities.Course;

public interface CourseService {

	
	   public List<Course> getCourses();
	   
	   
	   public Course getCourse(long courseId);
	   
	   public Course addCourse(Course course);
}

