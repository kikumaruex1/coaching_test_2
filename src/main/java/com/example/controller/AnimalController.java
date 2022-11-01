package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.AnimalService;

import antlr.collections.List;

@Controller
@RequestMapping
public class AnimalController {
	/*Q2-1*/

	private AnimalService animalService;

	@Autowired
	public AnimalController (AnimalService animalService)
	{
		this.animalService = animalService;
	}

	@GetMapping
	public String index(Model model)
	{
		List<Animal> Animals = this.animalService.index();

		return "index";
	}


}
