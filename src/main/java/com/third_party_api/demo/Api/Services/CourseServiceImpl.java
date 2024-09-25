package com.third_party_api.demo.Api.Services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.third_party_api.demo.Api.Entities.Course;

@Service

public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(145,"Java Code Course","This course contains free services"));
		list.add(new Course (4343,"Spring boot Course","Creating rest apis"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				
				c=course;
				break;
			}
			
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
	    list.add(course);
		return course;
	}

}
