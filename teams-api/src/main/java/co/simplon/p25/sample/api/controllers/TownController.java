package co.simplon.p25.sample.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.sample.api.entities.Town;
import co.simplon.p25.sample.api.services.TownService;

@RestController
@RequestMapping("/towns")
public class TownController {
	
	private final TownService service;

	public TownController(TownService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Town> getTowns() {
		return service.getTowns();
	}
}
