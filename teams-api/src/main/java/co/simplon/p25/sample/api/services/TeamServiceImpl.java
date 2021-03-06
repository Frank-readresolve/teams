package co.simplon.p25.sample.api.services;

import org.springframework.stereotype.Service;

import co.simplon.p25.sample.api.entities.Team;
import co.simplon.p25.sample.api.repositories.TeamRepository;

@Service // Indique a Spring que cette classe est un service
public class TeamServiceImpl implements TeamService {

    // On declare un champ final du type du repository souhaite
    private final TeamRepository repository;

    // On declare un constructeur avec le repositoty en argument
    // Spring injecte une instance du repository pour nous
    public TeamServiceImpl(TeamRepository repository) {
	this.repository = repository;
    }

    @Override
    public Team getById(Long id) {
	// findById est une methode par defaut de JpaRepository
	return repository.findById(id).get();
    }
}
