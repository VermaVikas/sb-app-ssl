package com.app.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employees;

@RestController
public class HomeController {

	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
	public ResponseEntity<List<Employees>> getAllEmployees() {
		List<Employees> list = Employees.getEmployeesList();
		System.out.println("list.size() :: " + list.size());
		if (list != null && list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}

}
