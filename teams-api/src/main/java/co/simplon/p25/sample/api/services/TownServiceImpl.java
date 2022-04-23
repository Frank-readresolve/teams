package co.simplon.p25.sample.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.sample.api.entities.Town;
import co.simplon.p25.sample.api.repositories.TownRepository;

@Service
public class TownServiceImpl implements TownService {
	
	private final TownRepository repository;
	
	public TownServiceImpl(TownRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Town> getTowns() {
		return repository.findAll();
	}

}
