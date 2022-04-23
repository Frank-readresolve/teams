package co.simplon.p25.sample.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.sample.api.entities.Town;

public interface TownRepository extends JpaRepository<Town, Long> {
	
}
