package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@RequestMapping("/")
	   public String hello() {
	        return "yaml file";
	    }

@RequestMapping("/source")
public String welcome() {
     return "Welcome user in yaml!";
 }



}