package com.springrestHorizon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrestHorizon.demo.entities.Course;
import com.springrestHorizon.demo.service.HorizonService;

@RestController
public class HorizonController {

	@Autowired
	private HorizonService hService;

	@GetMapping("/horizonHome")
	public String home() {
		return "Horizon Demo Home Page";
	}

	// get the courses available
	@GetMapping("/getCourse")
	public List<Course> getCourse() {

		return this.hService.getCourse();

	}
}
