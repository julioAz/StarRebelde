package br.julio.starrebelde.repository;

import br.julio.starrebelde.model.Rebel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rebeldeRepository extends JpaRepository<Rebel, Long> {

}
