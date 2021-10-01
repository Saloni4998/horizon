package com.springrestHorizon.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestHorizon.demo.entities.Course;

@Service
public class HorizonServiceImpl implements HorizonService {

	List<Course> horizon;

	public HorizonServiceImpl() {
		horizon = new ArrayList<>();
		horizon.add(new Course(23, "java", "java course for beginers"));
		horizon.add(new Course(45, "html", "Html Course"));
	}

	@Override
	public List<Course> getCourse() {
		return horizon;
	}

}
